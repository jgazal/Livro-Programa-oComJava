package Capitulo6;

//Esta classe implementa um array "resistente a falhas" que impede a ocorrência de erros de tempo de execução

class FailSoftArray {
    private int[] a;    //referência a array
    private int errval; //valor a retornar se get() falhar
    public int lenght;  //lenght é público

    //Contrói o array dados seu tamanho e o valor a ser retornado se get() falhar
    public FailSoftArray(int size, int errv){
        a = new int[size];
        errval = errv;
        lenght = size;
    }
    //retorna o valor do índice especificado
    public int get(int index){
        if(ok(index)) return a[index];  //detecta índice fora dos limites
        return errval;
    }
    //Insere um valor em um índice. Retorna false em caso de falha
    public boolean put (int index, int val){
        if(ok(index)){                  //detecta índice fora dos limites
            a[index] = val;
            return true;
        }
        return false;
    }
    //retorna true se index estiver dentro dos limites
    private boolean ok(int index){
        if(index >= 0 & index < lenght) return true;
        return false;
    }
}
//Demonstra o array resistente a falhas
class FSDemo{
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5,-1);
        int x;
        //exibe falhas silenciosas
        System.out.println("Fail quietly");
        for(int i=0; i<(fs.lenght * 2); i++)
            fs.put(i, i*10);    //O acesso ao array deve ser feito por intermédio de seus métodos de acesso

        for(int i=0; i<(fs.lenght*2); i++){
            x = fs.get(i);      //O acesso ao array deve ser feito por intermédio de seus métodos de acesso
            if(x != -1) System.out.println(x + " ");
        }
        System.out.println(" ");

        //Agora, trata as falhas
        System.out.println("\nFail with error reports");
        for(int i=0; i<(fs.lenght*2); i++)
            if(!fs.put(i, i*10))
                System.out.println("Index " + i + " out-of-bounds");

        for(int i=0; i<(fs.lenght*2); i++){
            x = fs.get(i);
            if(x != -1) System.out.println(x + " ");
            else
                System.out.println("Index " + i + " out-of-bounds");
        }
    }
}
