package Capitulo6;

//Uma classe de pilha simples para caracteres

class SimpleStack {

    private char[] data; //esse array contém a pilha
    private int tos; //índice do topo da pilha

    //Constrói uma pilha vazia dado seu tamanho
    SimpleStack(int size) {
        data = new char[size]; //cria o array para armazenar a pilha
        tos = 0;
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
    // retorna true se a pilha estiver cheia
    boolean isEmpty() {
        return tos==0;
    }

    //retorna true se a pilha estiver vazia
    boolean isFull() {
        return tos==data.length;
    }
}
//Demonstra a classe SimpleStack
class SimpleStackDemo {
    public static void main(String[] args) {
        int i;
        char ch;

        System.out.println("Demonstrate SimpleStack\n");

        //Constrói uma pilha vazia para 10 elementos
        SimpleStack stack = new SimpleStack(10);

        System.out.println("Push 10 items onto a 10-element stack.");

        //Insere as letras A a J na pilha
        System.out.print("Pushing: ");
        for(ch = 'A'; ch < 'K'; ch++) {
            System.out.print(ch);
            stack.push(ch);
        }
        System.out.println("\nPop those 10 items from stack.");

        //Agora, extrai os caracteres da pilha
        //Observe que a ordem será o inverso da inserção
        System.out.print("Popping: ");
        for(i=0; i < 10; i++) {
            ch = stack.pop();
            System.out.print(ch);
        }
        System.out.println("\n\nNext, use isEmpty() and isFull() " +
                "to fill and empty the stack.");

        //insere as letras até a pilha ficar cheia
        System.out.print("Pushing: ");
        for(ch = 'A'; !stack.isFull(); ch++) {
            System.out.print(ch);
            stack.push(ch);
        }
        System.out.println();

        //Agora, extrai os caracteres da pilha até ela ficar vazia
        System.out.print("Popping: ");
        while(!stack.isEmpty()) {
            ch = stack.pop();
            System.out.print(ch);
        }

        System.out.println("\n\nNow, use a 4-element stack to generate" +
                " some errors.");

        //Gera alguns erros
        SimpleStack smallStack = new SimpleStack(4);

        //Tenta inserir 5 caracteres em uma pilha de 4 caracteres
        System.out.print("Pushing: ");
        for(ch = '1'; ch < '6'; ch++) {
            System.out.print(ch);
            smallStack.push(ch);
        }
        //Tenta extrair 5 elementos de uma pilha de 4 caracteres
        System.out.print("Popping: ");
        for(i=0; i < 5; i++) {
            ch = smallStack.pop();
            System.out.print(ch);
        }
    }
}

