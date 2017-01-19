package Capitulo3;

/*Programa para converter letras minúsculas em maiúsculas, e letras maiúsculas em minúsculas.
O programa será encerrado quando o usuário inserir um ponto. No fim, ele deve exibir quantas
alterações ocorreram na caixa das letras.
OBS: As letras minúsculas ASCII ficam separadas das maiúsculas por um intervalo igual a 32.
Logo, para converter uma letra minúscula em maiúscula, temos que subtrair 32.*/

class Ex10 {

    public static void main(String[] args) throws java.io.IOException{
        char ch;
        int mudancas = 0;

        System.out.println(" ");

        do{
            ch = (char) System.in.read();

            if(ch >= 'a' & ch <= 'z') {
                ch -= 32;
                mudancas++;
                System.out.println(ch);

            }else if(ch >= 'A' & ch <= 'Z'){
                    ch += 32;
                    mudancas++;
                    System.out.println(ch);
                }
            }while (ch != '.');
            System.out.println("Mudanças: " + mudancas);
    }
}
