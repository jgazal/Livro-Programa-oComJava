package Capitulo22;

// TENTE ISTO 22-1

class GenSimpleStack<T> implements IGenSimpleStack<T> {
    private T[] data; // este array contém a pilha
    private int tos; // índice do topo da pilha

    // Constrói uma pilha vazia com o array dado como espaço de armazenamento.
    GenSimpleStack(T[] arrayRef) {
        data = arrayRef;
        tos = 0;
    }
    // Insere um item na pilha.
    public void push(T obj) throws StackFullException {
        if (isFull())
            throw new StackFullException(data.length);
        data[tos] = obj;
        tos++;
    }
    // Extrai um item da pilha.
    public T pop() throws StackEmptyException {
        if (isEmpty())
            throw new StackEmptyException();
        tos--;
        return data[tos];
    }
    // Sobrepõe toString() para GenSimpleStack.
    public String toString() {
        String result = "(";

        // Adiciona a representação na forma de string de todos os itens da pilha, separados por vírgulas.
        for (int i = 0; i < tos; i++) {
            result += data[i];
            if (i < tos - 1) // se não for o último item,

                // adiciona uma vírgula e um espaço
                result += ", ";
        }
        // Adiciona o parêntese direito e o retorna.
        result += ")";
        return result;
    }
    // Retorna true se a pilha estiver vazia.
    public boolean isEmpty() {
        return tos == 0;
    }
    // Retorna true se a pilha estiver cheia.
    public boolean isFull() {
        return tos == data.length;
    }
}
