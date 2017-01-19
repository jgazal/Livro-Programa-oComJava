package Capitulo27;

/* Um exemplo que usa um Callable.
 O programa a seguir ilustra Callable e Future criando três tarefas que executam três cálculos diferentes.
 A primeira retorna a soma de um valor, a segunda calcula  o tamanho da hipotenusa de um triângulo retângulo
 dado o tamanho de seus lados e  a terceira calcula o fatorial de um valor.
 Todos os três cálculos podem ocorrer simultaneamente.*/

import java.util.concurrent.*;

class CallableDemo {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        Future<Integer> f;
        Future<Double> f2;
        Future<Integer> f3;

        System.out.println("Starting");

        //Envia tarefas para execução.
        f = es.submit(new Sum(10));
        f2 = es.submit(new Hypot(3, 4));
        f3 = es.submit(new Factorial(5));

        try {
            //Obtém e exibe os resultados.
            System.out.println(f.get());
            System.out.println(f2.get());
            System.out.println(f3.get());

            // Usa a segunda forma de get( ) que usa um argumento TimeUnit.
            // Nessa versão, nenhuma chamada a get( ) esperará mais do que 10 milissegundos.
           /* System.out.println(f.get(10, TimeUnit.MILLISECONDS));
            System.out.println(f2.get(10, TimeUnit.MILLISECONDS));
            System.out.println(f3.get(10, TimeUnit.MILLISECONDS));*/

        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
        catch (ExecutionException exc) {
            System.out.println(exc);
        }
    /*    catch (TimeoutException exc) {
            System.out.println(exc);
        }*/
        es.shutdown();
        System.out.println("Done");
    }
}
// A seguir, temos três threads de cálculo.

// Retorna a soma de um valor
class Sum implements Callable<Integer> {
    int stop;
    Sum(int v) { stop = v; }
    public Integer call() {
        int sum = 0;
        for(int i = 1; i <= stop; i++) {
            sum += i;
        }
        return sum;
    }
}

// Calcula  o tamanho da hipotenusa de um triângulo retângulo dado o tamanho de seus lados
class Hypot implements Callable<Double> {
    double side1, side2;
    Hypot(double s1, double s2) {
        side1 = s1;
        side2 = s2;
    }
    public Double call() {
        return Math.sqrt((side1*side1) + (side2*side2));
    }
}

// Calcula o fatorial de um valor
class Factorial implements Callable<Integer> {
    int stop;
    Factorial(int v) { stop = v; }
    public Integer call() {
        int fact = 1;
        for(int i = 2; i <= stop; i++) {
            fact *= i;
        }
        return fact;
    }
}

