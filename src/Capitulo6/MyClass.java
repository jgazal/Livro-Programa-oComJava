package Capitulo6;

//Acesso público e privado

class MyClass {

    private int alpha;  //acesso privado
    public int beta;    //acesso público
    int gamma;          //acesso padrão

    /*Não há problema em um membro de uma classe acessar
    um membro privado da mesma classe*/

    void setAlpha(int a){
        alpha = a;
    }
    int getAlpha(){
        return alpha;
    }
}
class AcessDemo{
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        //O acesso a alpha só é permitido por intermédio de seus métodos acessadores
        ob.setAlpha(-99);
        System.out.println("ob.alpha é " + ob.getAlpha());

        //Você não pode acessar alpha dessa forma:
        //ob.alpha = 10;    //Errado! alpha é privado

        //Essas linhas estão corretas porque beta e gamma podem ser acessados
        ob.beta = 88;
        ob.gamma = 99;
    }
}
