package Capitulo27;

// Um exemplo simples que usa RecursiveTask<V>.

import java.util.concurrent.*;

// Um RecursiveTask que calcula a soma de um array de doubles.
class Sum2 extends RecursiveTask<Double> {   //Uma tarefa baseada em RecursiveTask.

    // O valor do limite sequencial.
    final int seqThresHold = 500;

    // Array a ser acessado.
    double[] data;

    // Determina que parte dos dados será processada.
    int start, end;
    Sum2(double[] vals, int s, int e ) {
        data = vals;
        start = s;
        end = e;
    }
    // Encontra a soma de um array de doubles.
    protected Double compute() {
        double sum = 0;

        // Se o número de elementos estiver abaixo do limite sequencial, processa sequencialmente.
        if((end - start) < seqThresHold) {

            // Soma os elementos.
            for(int i = start; i < end; i++) sum += data[i];
        }
        else {
            // Caso contrário, continua a dividir os dados em partes menores.

            // Encontra o ponto intermediário.
            int middle = (start + end) / 2;

            // Chama novas tarefas, usando os dados subdivididos.
            Sum2 subTaskA = new Sum2(data, start, middle);
            Sum2 subTaskB = new Sum2(data, middle, end);

            // Inicia cada subtarefa com fork().
            subTaskA.fork();
            subTaskB.fork();

            // Espera as subtarefas retornarem e agrega os resultados.
            sum = subTaskA.join() + subTaskB.join();
        }
        // Retorna a soma final.
        return sum;
    }
}
// Demonstra a execução paralela.
class RecurTaskDemo {
    public static void main(String[] args) {

        // Cria um pool de tarefas.
        ForkJoinPool fjp = new ForkJoinPool();
        double[] nums = new double[5000];

        // Inicializa nums com valores que se alternam entre positivo e negativo.
        for(int i=0; i < nums.length; i++)
            nums[i] = (double) (((i%2) == 0) ? i : -i) ;
        Sum2 task = new Sum2(nums, 0, nums.length);

        // Inicia os ForkJoinTasks. Observe que, nesse caso, invoke() retorna um resultado.
        double summation = fjp.invoke(task);
        System.out.println("Summation " + summation);
    }
}
