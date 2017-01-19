package Capitulo10;

//Adiciona o tratamento de exceções às classes de pilha

//Exceção para erros de pilha cheia
class StackFullException extends Exception {
    int size;

    StackFullException(int s) {
        super("Stack Full");
        size = s;
    }
    public String toString() {
        return "\nStack is full. Maximum size is " + size;
    }
}
//Uma exceção para erros de pilha vazia
class StackEmptyException extends Exception {

    StackEmptyException() {
        super("Stack Empty");
    }
    public String toString() {
        return "\nStack is empty.";
    }
}
//Pilha de tamanho fixo para caracteres que usa exceções
class FixedLengthStack implements ISimpleStack {
    private char[] data; //esse array contém a pilha
    private int tos; //índice do topo da pilha

    //Constrói uma pilha vazia dado seu tamanho
    FixedLengthStack(int size) {
        data = new char[size]; //cria o array para armazenar a pilha
        tos = 0;
    }
    //Constrói uma pilha a partir de outra
    FixedLengthStack(FixedLengthStack otherStack) {
        //o tamanho da nova pilha é igual ao de otherstack
        data = new char[otherStack.data.length];

        //configura tos com a mesma posição
        tos = otherStack.tos;

        // copy the contents
        for(int i = 0; i < tos; i++)
            data[i] = otherStack.data[i];
    }

    //Constrói uma pilha com valores iniciais
    FixedLengthStack(char[] chrs) throws StackFullException {
        //Cria o array para armazenar os valores iniciais
        data = new char[chrs.length];
        tos = 0;

        //inicializa a pilha inserindo nela o conteúdo de chrs
        for(char ch : chrs)
            push(ch);
    }

    //insere um caractere na pilha
    public void push(char ch) throws StackFullException {
        if(isFull())
            throw new StackFullException(data.length);

        data[tos] = ch;
        tos++;
    }

    //extrai um caractere da pilha
    public char pop() throws StackEmptyException {
        if(isEmpty())
            throw new StackEmptyException();

        tos--;
        return data[tos];
    }

    //Retorna true se a pilha estiver vazia
    public boolean isEmpty() {
        return tos==0;
    }

    //Retorna true se a pilha estiver cheia
    public boolean isFull() {
        return tos==data.length;
    }
}

//Demonstra as exceções de pilha
class SimpleStackExcDemo {
    public static void main(String[] args) {
        FixedLengthStack stack = new FixedLengthStack(5);
        char ch;
        int i;

        try {
            //excede a pilha
            for(i=0; i < 6; i++) {
                System.out.print("Attempting to push : " +
                        (char) ('A' + i));
                stack.push((char) ('A' + i));
                System.out.println(" - OK");
            }
            System.out.println();
        }
        catch (StackFullException exc) {
            System.out.println(exc);
        }

        System.out.println();

        try {
            //tenta acessar elemento em fila vazia
            for(i=0; i < 6; i++) {
                System.out.print("Popping next char: ");
                ch = stack.pop();
                System.out.println(ch);
            }
        }
        catch (StackEmptyException exc) {
            System.out.println(exc);
        }
    }
}
