package Capitulo27;

// Um exemplo simples da estratégia básica de dividir e conquistar.
// Nesse caso, RecursiveAction é usada.

import java.util.concurrent.*;
import java.util.*;

// Um ForkJoinTask (via RecursiveAction) que transforma os elementos
// de um array de doubles em suas raízes quadradas.
class SqrtTransform extends RecursiveAction {   //Uma tarefa baseada em RecursiveAction.
// O valor do limite é configurado arbitrariamente com 1.000 neste exemplo.
// Em códigos do mundo real, seu valor ótimo pode ser determinado pela modelagem e experimentação.
    final int seqThreshold = 1000;

    // Array a ser acessado.
    double[] data;

    // Determina que parte dos dados será processada.
    int start, end;
    SqrtTransform(double[] vals, int s, int e ) {
        data = vals;
        start = s;
        end = e;
    }
    // Este é o método em que a computação paralela ocorrerá.
    protected void compute() {

        // Se o número de elementos estiver abaixo do limite sequencial, processa sequencialmente.
        if((end - start) < seqThreshold) {
            // Transforma cada elemento em sua raiz quadrada.
            for(int i = start; i < end; i++) {
                data[i] = Math.sqrt(data[i]);
            }
        }
        else {
            // Caso contrário, continua a dividir os dados em partes menores.
            // Encontra o ponto intermediário.
            int middle = (start + end) / 2;

            // Chama novas tarefas, usando os dados subdivididos.
            invokeAll(new SqrtTransform(data, start, middle),   //Divide a tarefa em duas.
                    new SqrtTransform(data, middle, end));
        }
    }
}
// Demonstra a execução paralela.
class ForkJoinDemo {
    public static void main(String[] args) {

        // Cria um pool de tarefas.
        ForkJoinPool fjp = new ForkJoinPool();
        double[] nums = new double[100000];

        // Dá a nums alguns valores.
        for(int i = 0; i < nums.length; i++)
            nums[i] = (double) i;

        System.out.println("A portion of the original sequence:");

        for(int i=0; i < 10; i++)
            System.out.print(nums[i] + " ");
        System.out.println("\n");

        SqrtTransform task = new SqrtTransform(nums, 0, nums.length);   //Cria uma tarefa.

        // Inicia o ForkJoinTask principal.
        fjp.invoke(task);   //Executa a tarefa

        System.out.println("A portion of the transformed sequence" +
                " (to four decimal places):");

        for(int i=0; i < 10; i++)
            System.out.format("%.4f ", nums[i]);
        System.out.println();
    }
}
