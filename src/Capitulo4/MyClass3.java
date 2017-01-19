package Capitulo4;

//Demonstre a coleta de lixo

class MyClass3 {
    int x;

    MyClass3(int i){
        x = i;
    }
    //Chamado quando o objeto é reciclado
    protected void finalize(){
        System.out.println("Finalizing " + x);
    }
    //Gera um objeto que é imediatamente abandonado
    void generate(int i){
        MyClass3 o = new MyClass3(i);
    }
}
class GCDemo{

    public static void main(String[] args) {
        MyClass3 ob = new MyClass3(0);

        //Agora, gere um grande número de objeto. Em algum momento, a coleta de lixo ocorrerá.
        //NOTA: Você pode ter de aumentar o número de objetos gerados para forçar a coleta de lixo.

        for(int count=1; count<1000000; count++){
            ob.generate(count);
        }
    }
}
