package Capitulo8;

//Uma interface para uma pilha simples que armazena caracteres

public interface ISimpleStack {

    //Insere um caractere na pilha
    void push(char ch);

    //Remove um caractere da pilha
    char pop();

    //Retorna true se a pilha estiver vazia
    boolean isEmpty();

    //Retorna true se a pilha estiver cheia
    boolean isFull();
}
