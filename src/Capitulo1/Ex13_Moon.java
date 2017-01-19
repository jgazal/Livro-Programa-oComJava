package Capitulo1;

class Ex13 {

    public static void main(String[] args) {
        double pesoTerra;   //peso na Terra
        double pesoLua;     //peso na Lua

        pesoTerra = 75;
        pesoLua = pesoTerra * 0.17;  //A gravidade da lua é cerca de 17% a da Terra.

        System.out.println(pesoTerra + "kg na terra é equivalente a " + pesoLua + "kg na Lua");
    }
}
