package Capitulo14;

// Pilha genérica simples de tamanho fixo.
class GenSimpleStack<T> implements IGenSimpleStack<T> {
    private T[] data; // esse array contém a pilha
    private int tos; // índice do topo da pilha
    // Constrói uma pilha vazia com o array dado como espaço de
// armazenamento.
    GenSimpleStack(T[] arrayRef) {
        data = arrayRef;
        tos = 0;
    }
    // Insere um item na pilha.
    public void push(T obj) throws StackFullException {
        if(isFull())
            throw new StackFullException(data.length);
        data[tos] = obj;
        tos++;
    }
    // Retira um item da pilha.
    public T pop() throws StackEmptyException {
        if(isEmpty())
            throw new StackEmptyException();
        tos--;
        return data[tos];
    }
    // Retorna true se a pilha estiver vazia.
    public boolean isEmpty() {
        return tos==0;
    }
    // Retorna true se a pilha estiver cheia.
    public boolean isFull() {
        return tos==data.length;
    }
}