package Capitulo11;

/* Programa de ajuda que usa um arquivo em disco
   para armazenar informações de ajuda.
*/

import java.io.*;

/* A classe Help abre um arquivo de ajuda, procura um tópico e
   exibe as informações associadas a esse tópico.
   Observe que ela mesma trata todas as exceções de I/O, evitando
   ser preciso chamar um código que faça isso
 */
class Help {
    String helpfile; //nome do arquivo de ajuda

    Help(String fname) {
        helpfile = fname;
    }

    //Exibe ajuda sobre um tópico
    boolean helpOn(String what) {
        int ch;
        String topic, info;

        //Abre o arquivo de ajuda
        try (BufferedReader helpRdr = new BufferedReader(new FileReader(helpfile))) {
            do {
                //lê caracteres até um # ser encontrado
                ch = helpRdr.read();

                //agora, vê se os tópicos coincidem
                if(ch == '#') {
                    topic = helpRdr.readLine();
                    topic = topic.trim(); //remove o espaço em branco inicial e final

                    if(what.compareTo(topic) == 0) { //tópico encontrado
                        do {
                            info = helpRdr.readLine();
                            if(info != null) System.out.println(info);
                        } while((info != null) &&
                                (info.trim().compareTo("") != 0));
                        return true;
                    }
                }
            } while(ch != -1);
        }
        catch(IOException exc) {
            System.out.println("Error accessing help file.");
            return false;
        }
        return false; //tópico não encontrado
    }

    //Acessa um tópico da Ajuda
    String getSelection() {
        String topic = "";

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Enter topic: ");
        try {
            topic = br.readLine();
        }
        catch(IOException exc) {
            System.out.println("Error reading console.");
        }
        return topic;
    }
}

//Demonstra o sistema de ajuda baseado em arquivo
class FileHelp {
    public static void main(String[] args) {
        Help hlpobj = new Help("helpfile.txt");
        String topic;

        System.out.println("Try the help system. " + "Enter 'stop' to end.");

        do {
            topic = hlpobj.getSelection();

            if(!hlpobj.helpOn(topic))
                System.out.println("Topic not found.\n");

        } while(topic.compareTo("stop") != 0);
    }
}
