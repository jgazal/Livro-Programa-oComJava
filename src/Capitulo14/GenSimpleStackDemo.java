package Capitulo14;

/* Tente isto 14-1
Demonstra uma classe genérica de pilha simples.
*/
class GenSimpleStackDemo {
    public static void main(String[] args) {
        int i;
        Integer[] nums = new Integer[5];
        String[] strs = new String[3];
    // primeiro cria uma pilha de inteiros
        GenSimpleStack<Integer> intStack = new GenSimpleStack<Integer>(nums);
        System.out.println("Demonstrating Integer stack.");
    // usa intStack
        try {
            System.out.print("Pushing: ");
    // insere inteiros em intStack
            for(i = 0; !intStack.isFull(); i++) {
                System.out.print(i);
                intStack.push(i);
            }
            System.out.println();
    // retira inteiros de intStack
            System.out.print("Popping: ");
            while(!intStack.isEmpty())
                System.out.print(intStack.pop());
            System.out.println();
        } catch (StackFullException exc) {
            System.out.println(exc);
        } catch (StackEmptyException exc) {
            System.out.println(exc);
        }
    // em seguida, cria uma pilha para strings
        GenSimpleStack<String> strStack = new GenSimpleStack<String>(strs);
        System.out.println("\nDemonstrating String stack.");
        // agora, usa strStack
        try {
            System.out.println("Pushing: alpha beta gamma");
    // insere strings em strStack
            strStack.push("alpha");
            strStack.push("beta");
            strStack.push("gamma");
    // remove Strings de strStack
            System.out.print("Popping: ");
            while(!strStack.isEmpty())
                System.out.print(strStack.pop() + " ");
            System.out.println();
        } catch (StackFullException exc) {
            System.out.println(exc);
        } catch (StackEmptyException exc) {
            System.out.println(exc);
        } System.out.println();
    }
}
