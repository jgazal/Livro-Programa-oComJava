package Capitulo22;

class GenStackToStringDemo {

    public static void main(String[] args)
            throws StackFullException, StackEmptyException {

        Integer iStore[] = new Integer[10];
        GenSimpleStack<Integer> stack = new GenSimpleStack<Integer>(iStore);
        System.out.println("Empty stack: " + stack);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();

        System.out.println("Non-empty stack: " + stack);
    }
}
