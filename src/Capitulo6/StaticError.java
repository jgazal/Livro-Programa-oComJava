package Capitulo6;

class StaticError {
    int denom = 3; //uma variável de instância comum
    static int val = 1024; //uma variável estática

    //Erro! Não pode acessar uma variável não estática de dentro de um método estático
  /*  static int valDivDenom() {
        return val/denom; //não será compilado
    }*/
}
