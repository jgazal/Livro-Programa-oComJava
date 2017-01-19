package Capitulo14;

// Exceção para erros de pilha cheia.
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
// Exceção para erros de pilha vazia.
class StackEmptyException extends Exception {
    StackEmptyException() {
        super("Stack Empty");
    }
    public String toString() {
        return "\nStack is empty.";
    }
}