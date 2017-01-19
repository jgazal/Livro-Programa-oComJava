package Capitulo24;

// Usa Scanner para calcular a média dos valores.

import java.util.*;

class AvgNums {
    public static void main(String[] args) {
        Scanner conin = new Scanner(System.in); //Cria um Scanner que lê de System.in

        int count = 0;
        double sum = 0.0;

        System.out.println("Enter numbers to average.");

        // Lê e soma os números.
        while(conin.hasNext()) {    //Percorre enquanto houver tokens para ler
            if(conin.hasNextDouble()) {     //Verifica se o próximo token pode ser lido
                sum += conin.nextDouble();  //como um double. Se puder, lê o token.
                count++;
            }
            else {
                String str = conin.next();
                if(str.equals("done")) break;   //Caso contrário, procura o string "done".
                else {
                    System.out.println("Data format error.");
                    return;
                }
            }
        }
        System.out.println("Average is " + sum / count);
        conin.close();
    }
}

