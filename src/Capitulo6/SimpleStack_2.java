package Capitulo6;

//Adiciona construtores sobrecarregados a SimpleStack

class SimpleStack2 {
    //agora os membros a seguir são privados
    private char[] data; //esse array contém a pilha
    private int tos; //índice do topo da pilha

    //Constrói uma pilha vazia dado seu tamanho
    SimpleStack2(int size) {
        data = new char[size]; //cria o array para conter a pilha
        tos = 0;
    }
    //Constrói uma pilha a partir de outra
    SimpleStack2(SimpleStack2 otherStack) {
        //o tamanho da nova pilha é igual ao de otherStack
        data = new char[otherStack.data.length];

        //configura tos com a mesma posição
        tos = otherStack.tos;

        //copia o conteúdo
        for(int i = 0; i < tos; i++)
            data[i] = otherStack.data[i];
    }
    //Constrói uma pilha com valores iniciais
    SimpleStack2(char[] chrs) {
        //cria o array para armazenar os valores iniciais
        data = new char[chrs.length];
        tos = 0;

        //inicializa a pilha inserindo nela o conteúdo de chars
        for(char ch : chrs)
            push(ch);
    }
    //Insere um caractere na pilha
    void push(char ch) {
        if(isFull()) {
            System.out.println(" -- Stack is full.");
            return;
        }
        data[tos] = ch;
        tos++;
    }
    //Extrai um caractere da pilha
    char pop() {
        if(isEmpty()) {
            System.out.println(" -- Stack is empty.");
            return (char) 0; //um valor de espaço reservado
        }
        tos--;
        return data[tos];
    }
    //retorna true se a pilha estiver vazia
    boolean isEmpty() {
        return tos==0;
    }

    //retorna true se a pilha estiver cheia
    boolean isFull() {
        return tos==data.length;
    }
}
//Demonstra os construtores sobrecarregados da classe SimpleStack
class SimpleStackDemo2 {
    public static void main(String[] args) {
        int i;
        char ch;

        char[] chrs = { 'A', 'B', 'C', 'D' };

        //Inicializa stack1 com chrs
        SimpleStack2 stack1 = new SimpleStack2(chrs);

        //Inicializa stack2 com o conteúdo de stack1
        SimpleStack2 stack2 = new SimpleStack2(stack1);

        System.out.print("Popping contents of stack1: ");
        while(!stack1.isEmpty()) {
            ch = stack1.pop();
            System.out.print(ch);
        }
        System.out.print("\nPopping contents of stack2: ");
        while(!stack2.isEmpty()) {
            ch = stack2.pop();
            System.out.print(ch);
        }
    }
}
