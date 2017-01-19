package Capitulo14;

// Demonstra um tipo bruto.
class Generic<T> {
    T ob;   // declara uma referência a um objeto de tipo T
            // Passa para o construtor uma referência a um objeto de tipo T.
    Generic(T o) {
        ob = o;
    }
    // Retorna ob.
    T getob() {
        return ob;
    }
}
// Demonstra o tipo bruto.
class RawDemo {
    public static void main(String[] args) {
// Cria um objeto Gen para Integers.
        Gen<Integer> iOb = new Gen<Integer>(88);
// Cria um objeto Gen para Strings.
        Gen<String> strOb = new Gen<String>("Generics Test");
// Cria um objeto Gen de tipo bruto e dá a ele um valor Double.
        Gen raw = new Gen(new Double(98.6));    //quando nenhum argumento de tipo é fornecido, um tipo bruto é criado
// Essa coerção é necessária porque o tipo é desconhecido.
        double d = (Double) raw.getob();
        System.out.println("value: " + d);

// O uso de um tipo bruto pode levar a exceções de tempo de execução.
// Aqui estão alguns exemplos.

// A coerção a seguir causa um erro de tempo de execução!
// int i = (Integer) raw.getob(); // erro de tempo de execução

// Essa atribuição sobrepõe a segurança de tipos.
        strOb = raw; // Correto, mas pode gerar erros   //Os tipos brutos soprepõem a segurança de tipos
// String str = strOb.getob(); // erro de tempo de execução

// Essa atribuição também sobrepõe a segurança de tipos.
        raw = iOb; // Correto, mas pode gerar erros
// d = (Double) raw.getob(); // erro de tempo de execução
    }
}