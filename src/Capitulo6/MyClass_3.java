package Capitulo6;

//Conta instâncias

class MyClass_3 {
    //Essa variável estática será incrementada sempre que um objeto MyClass for criado
    static int count = 0;

    MyClass_3() {
        count++; //incrementa a contagem
    }
}
class UseStatic {
    public static void main(String[] args) {
        for(int i=0; i < 3; i++) {
            MyClass_3 obj = new MyClass_3();
            System.out.println("Number of objects created: " + MyClass_3.count);
        }
    }
}
