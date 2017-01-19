package Capitulo22;

// Este programa demonstra as duas formas de substring().

class UseSubStrings {
    public static void main(String[] args) {
        String orgStr = "This is a test. This is, too.";
        String searchStr = "is";
        String subStr = "was";
        String resultStr = "";
        int i;
        System.out.println("Original string: " + orgStr);

        // Obtém a segunda frase em orgStr. Isso é feito primeiro com a busca do fim da primeira frase
        // e então com a obtenção do resto do string.
        i = orgStr.indexOf(".") + 2;    //Encontra o fim da primeira frase.
        String str = orgStr.substring(i);   //Usa substring( ) para obter a segunda frase.
        System.out.println("Second sentence: " + str + "\n");

        // Substitui todas as ocorrências de searchStr por subStr.
        System.out.println ("Progressively replacing " +
                searchStr + " with " + subStr);
        do {
            System.out.println(orgStr);

            // encontra as próximas ocorrências de searchStr.
            i = orgStr.indexOf(searchStr);  //Encontra o índice da próxima substituição.
            if(i != -1) {

                // obtém a primeira parte do string
                resultStr = orgStr.substring(0, i); //Obtém a primeira parte do string até o ponto de substituição.

                // adiciona a sequência de substituição
                resultStr = resultStr + subStr;

                // adiciona o resto do string, saltando searchStr
                resultStr = resultStr + orgStr.substring(i + searchStr.length());   //Agora, usa substring( ) para
                                                                                    // obter o resto do string.

                // cria o string resultante, o novo orgstr
                orgStr = resultStr;
            }
        } while(i != -1);
    }
}
