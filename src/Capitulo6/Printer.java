package Capitulo6;

class Printer {
    void printArray(int[] array) {
        printArrayAux(array, 0); //começa no elemento zero
        System.out.println();
    }
    void printArrayAux(int[] array, int index) {
        if(index == array.length)
            return; //terminamos
        else { //há mais elementos para exibir
            System.out.print(array[index] + " ");
            printArrayAux(array, index+1);
        }
    }
}
class PrinterDemo {
    public static void main(String[] args) {
        Printer printer = new Printer();
        int[] array = { 3,1,4,2,5,7,6,8 };

        printer.printArray(array);
    }
}
