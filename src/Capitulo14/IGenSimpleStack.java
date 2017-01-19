package Capitulo14;

// Interface genérica para uma pilha simples.
public interface IGenSimpleStack<T> {
    // Insere um item na pilha.
    void push(T item) throws StackFullException;
    // Retira um item da pilha.
    T pop() throws StackEmptyException;
    // Retorna true se a pilha estiver vazia.
    boolean isEmpty();
    // Retorna true se a pilha estiver cheia.
    boolean isFull();
}
