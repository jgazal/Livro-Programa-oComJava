package Capitulo7;

//Retorna um objeto String

class ErrorMsg {
    //Códigos de erro
    final int OUTERR = 0;
    final int INERR = 1;    //Declara constantes final
    final int DISKERR = 2;
    final int INDEXERR = 3;

    String[] msgs = {"Output Error", "Input Error", "Disk Full", "Index Out-Of-Bounds"};

    //Retorna a mensagem de erro
    String getErrorMsg(int i){
        if(i>=0 & i<msgs.length)
            return msgs[i];
        else
            return "Invalid Error Code";
    }
}
class FinalD{
    public static void main(String[] args) {
        ErrorMsg err = new ErrorMsg();

        System.out.println(err.getErrorMsg(err.OUTERR));    //Usa constantes final
        System.out.println(err.getErrorMsg(err.DISKERR));
    }
}
