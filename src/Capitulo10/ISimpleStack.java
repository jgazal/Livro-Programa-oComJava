package Capitulo10;

//Uma interface de pilha simples que lança exceções
public interface ISimpleStack {

    //Insere um caractere na pilha
    void push(char ch) throws StackFullException;

    //Extrai um caractere da pilha
    char pop() throws StackEmptyException;

    //Retorna true se a pilha estiver vazia
    boolean isEmpty();

    //Retorna true se a pilha estiver cheia
    boolean isFull();
}
