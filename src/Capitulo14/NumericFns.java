package Capitulo14;

// Nesta versão de NumericFns, o argumento de tipo
// de T deve ser Number ou uma classe derivada de Number.
class NumericFns<T extends Number> {    //Nese caso, o argumento de tipo deve ser Number ou uma subclasse de Number
    T num;
    // Passa para o construtor uma referência
// a um objeto numérico.
    NumericFns(T n) {
        num = n;
    }
    // Retorna o recíproco.
    double reciprocal() {
        return 1 / num.doubleValue();
    }
    // Retorna o componente fracionário.
    double fraction() {
        return num.doubleValue() - num.intValue();
    }
    // Determina se os valores absolutos de dois objetos são iguais.
    boolean absEqual(NumericFns<?> ob) {
        if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())) return true;
        return false;
    }
// ...
}
// Demonstra NumericFns.
class BoundsDemo {
    public static void main(String[] args) {
        NumericFns<Integer> iOb = new NumericFns<Integer>(5);   //Integer pode ser usado porque é subclasse de Number
        System.out.println("Reciprocal of iOb is " + iOb.reciprocal());
        System.out.println("Fractional component of iOb is " + iOb.fraction());
        System.out.println();
        NumericFns<Double> dOb = new NumericFns<Double>(5.25);  //Double também pode ser usado
        System.out.println("Reciprocal of dOb is " + dOb.reciprocal());
        System.out.println("Fractional component of dOb is " + dOb.fraction());

// Essa parte não será compilada porque String não é
// subclasse de Number.
// NumericFns<String> strOb = new NumericFns<String>("Error");  //String não pode ser usado porque
                                                                // não é subclasse de Number
    }
}
// Demonstra um curinga.
class WildcardDemo {
    public static void main(String[] args) {
        NumericFns<Integer> iOb = new NumericFns<Integer>(6);
        NumericFns<Double> dOb = new NumericFns<Double>(-6.0);
        NumericFns<Long> lOb = new NumericFns<Long>(5L);
        System.out.println("Testing iOb and dOb.");
        if(iOb.absEqual(dOb))   //Nesta chamada, o tipo curinga equivale a double
            System.out.println("Absolute values are equal.");
        else
            System.out.println("Absolute values differ.");
        System.out.println();
        System.out.println("Testing iOb and lOb.");
        if(iOb.absEqual(lOb))   //Nessa chamada, o curinga equivale a Long
            System.out.println("Absolute values are equal.");
        else
            System.out.println("Absolute values differ.");
    }
}

