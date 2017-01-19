package Capitulo27;

// Um programa simples que nos permite fazer testes com os efeitos da
// alteração do limite e do paraleslimo de um ForkJoinTask.

import java.util.concurrent.*;

// Um ForkJoinTask (via RecursiveAction) que executa uma transformação nos elementos de um array de doubles.
class Transform extends RecursiveAction {

    // Limite sequencial, que é definido pelo construtor.
    int seqThreshold;

    // Array a ser acessado.
    double[] data;

    // Determina que parte dos dados será processada.
    int start, end;
    Transform(double[] vals, int s, int e, int t ) {
        data = vals;
        start = s;
        end = e;
        seqThreshold = t;
    }
    // Este é o método em que a computação paralela ocorrerá.
    protected void compute() {

        // Se o número de elementos estiver abaixo do limite sequencial, processa sequencialmente.
        if((end - start) < seqThreshold) {
            // O código a seguir atribui a um elemento de um índice par a raiz quadrada de seu valor original.
            // Um elemento de um índice ímpar recebe sua raiz cúbica.
            // Esse código foi projetado para consumir tempo de CPU suficiente apenas para os efeitos da execução
            // concorrente serem observados com mais rapidez.
            for(int i = start; i < end; i++) {
                if((data[i] % 2) == 0)
                    data[i] = Math.sqrt(data[i]);
                else
                    data[i] = Math.cbrt(data[i]);
            }
        }
        else {
            // Caso contrário, continua a dividir os dados em partes menores.

            // Encontra o ponto intermediário.
            int middle = (start + end) / 2;

            // Chama novas tarefas, usando os dados subdivididos.
            invokeAll(new Transform(data, start, middle, seqThreshold),
                    new Transform(data, middle, end, seqThreshold));
        }
    }
}
// Demonstra a execução paralela.
class FJExperiment {
    public static void main(String[] args) {
        int pLevel;
        int threshold;

        if(args.length != 2) {
            System.out.println("Usage: FJExperiment parallelism threshold ");
            return;
        }
        // Define o nível de paralelismo e o limite sequencial como especificado na linha de comando.
        pLevel = Integer.parseInt(args[0]);
        threshold = Integer.parseInt(args[1]);

        // Essas variáveis são usadas para cronometrar a tarefa.
        long beginT, endT;

        // Cria um pool de tarefas. Observe que o nível de paralelismo é definido.
        ForkJoinPool fjp = new ForkJoinPool(pLevel);

        double[] nums = new double[1000000];

        for(int i = 0; i < nums.length; i++)
            nums[i] = (double) i;

        Transform task = new Transform(nums, 0, nums.length, threshold);

        // Começa a cronometrar.
        beginT = System.nanoTime();

        // Inicia o ForkJoinTask principal.
        fjp.invoke(task);

        // Termina a cronometragem.
        endT = System.nanoTime();

        System.out.println("Level of parallelism: " + pLevel);
        System.out.println("Sequential threshold: " + threshold);
        System.out.println("Elapsed time: " + (endT - beginT) + " ns");
        System.out.println();
    }
}