package Capitulo14;

// Exemplo de interface genérica.
// Uma interface genérica que lida com armazenamento.

// Esta interface requer que a classe usuária tenha um ou mais valores.
interface Containment<T> {  //Interface Genérica
    // O método contains() verifica se um item especificado está contido dentro de um objeto que implementa Containment.
    boolean contains(T o);
}
