package Capitulo8;

//Pilha de tamanho fixo para caracteres

class FixedLengthStack implements ISimpleStack{
    private char[] data;    //esse array contém a pilha
    private int tos;        //índice do topo da pilha

    //Constrói uma pilha vazia dado seu tamanho
    FixedLengthStack(int size){
        data = new char[size];  //cria o array para armazenar a pilha
        tos = 0;
    }
    //Constrói uma pilha a partir de outra
    FixedLengthStack(FixedLengthStack otherStack){
        //o tamanho da nova pilha e igual ao de otherStack
        data = new char[otherStack.data.length];

        //Configura tos com a mesma posição
        tos = otherStack.tos;

        //Copia o conteúdo
        for(int i=0; i<tos; i++)
            data[i] = otherStack.data[i];
    }
    //Constrói uma pilha com valores iniciais
    FixedLengthStack(char[] chrs){
        //cria o array para armazenar os valores iniciais
        data = new char[chrs.length];
        tos = 0;

        //inicializa a pilha inserindo nela o conteúdo de chrs
        for(char ch : chrs)
            push(ch);
    }
    //Insere um caractere na pilha
    public void push(char ch){
        if(isFull()){
            System.out.println(" -- Stack is Full");
            return;
        }
        data[tos] = ch;
        tos++;
    }
    //Remove um caractere da pilha
    public char pop(){
        if(isEmpty()){
            System.out.println(" -- Stack is empty");
            return (char) 0;    //valor de espaço reservado
        }
        tos--;
        return data[tos];
    }
    //Retorna true se a pilha estiver vazia
    public boolean isEmpty(){
        return tos==0;
    }
    //Retorna true se a pilha estiver cheia
    public boolean isFull(){
        return tos==data.length;
    }
}
//Uma pilha expansível para caracteres
class DynamicStack implements ISimpleStack {
    private char[] data; //esse array contém a pilha
    private int tos; //índice do topo da pilha

    //Constrói uma pilha vazia dado seu tamanho
    DynamicStack(int size) {
        data = new char[size]; //cria o array para armazenar a pilha
        tos = 0;
    }

    //Constrói uma pilha a partir de outra
    DynamicStack(DynamicStack otherStack) {
        //o tamanho da nova pilha é igual ao de otherStack
        data = new char[otherStack.data.length];

        //configura tos com a mesma posição
        tos = otherStack.tos;

        //copia o conteúdo
        for(int i = 0; i < tos; i++)
            data[i] = otherStack.data[i];
    }
    //Constrói uma pilha com valores iniciais
    DynamicStack(char[] chrs) {
        //cria o array para armazenar os valores iniciais
        data = new char[chrs.length];
        tos = 0;

        //inicializa a pilha inserindo nela o conteúdo de chrs
        for(char ch : chrs)
            push(ch);
    }
    //Insere um caractere na pilha
    public void push(char ch) {

        //se não houver mais espaço no array, expande o tamanho da pilha
        if(tos == data.length) {
            //dobra o tamanho do array existente
            char[] t = new char[data.length * 2];

            //copia o conteúdo da pilha no array maior
            for(int i = 0; i < tos; i++)
                t[i] = data[i];

            //configura data para referenciar o novo array
            data = t;
        }
        data[tos] = ch;
        tos++;
    }
    //Remove um caractere da pilha
    public char pop() {
        if(isEmpty()) {
            System.out.println(" -- Stack is empty.");
            return (char) 0; // a placeholder value
        }
        tos--;
        return data[tos];
    }
    //Retorna true se a pilha estiver cheia
    public boolean isEmpty() {
        return tos==0;
    }

    //Retorna true se a pilha estiver vazia. para DynamicStack, esse método sempre retorna false
    public boolean isFull() {
        return false;
    }
}
// Demonstra ISimpleStack.
class ISimpleStackDemo {
    public static void main(String[] args) {
        int i;
        char ch;

        //Cria uma variável de interface ISimpleStack
        ISimpleStack iStack;

        //Agora, constrói um FixedLengthStack e um DynamicStack
        FixedLengthStack fixedStack = new FixedLengthStack(10);
        DynamicStack dynStack = new DynamicStack(5);

        //primeiro, usa fixedStack por meio de iStack
        iStack = fixedStack;

        //insere caracteres em fixedStack
        for (i = 0; !iStack.isFull(); i++)
            iStack.push((char) ('A' + i));

        //remove caracteres de fixedStack
        System.out.print("Contents of fixedStack: ");
        while (!iStack.isEmpty()) {
            ch = iStack.pop();
            System.out.print(ch);
        }

        System.out.println();

        //em seguida, usa dynStack por intermédio de iStack
        iStack = dynStack;

        //insere A até Z em dynStack, isso resultará em aumentar três vezes o seu tamanho
        for (i = 0; i < 26; i++)
            iStack.push((char) ('A' + i));

        //remove caracteres de dynStack
        System.out.print("Contents of dynStack: ");
        while (!iStack.isEmpty()) {
            ch = iStack.pop();
            System.out.print(ch);
        }
    }
}
