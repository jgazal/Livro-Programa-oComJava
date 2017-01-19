package Capitulo4;

//Classe Power escrita com o uso da referência this

class Power2 {

    double b;
    int e;
    double val;

    Power2(double base, int exp){
        this.b = base;
        this.e = exp;
        this.val = 1;

        if(exp == 0) return;
        for( ; exp>0; exp--) this.val = this.val * base;

    }
    double getPwr(){
        return this.val;
    }
}
class DemoPower2 {

    public static void main(String[] args) {
        Power x = new Power(4.0, 2);
        Power y = new Power(2.5, 1);
        Power z = new Power(5.7, 0);

        System.out.println(x.b + " elevado a " + x.e + " potência é " + x.getPwr());
        System.out.println(y.b + " elevado a " + y.e + " potência é " + y.getPwr());
        System.out.println(z.b + " elevado a " + z.e + " potência é " + z.getPwr());
    }
}
