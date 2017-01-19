package Capitulo3;

class Help {

    public static void main(String[] args) throws java.io.IOException {
        char choice;

        System.out.println("Help on:");
        System.out.println("  1. if");
        System.out.println("  2. switch");
        System.out.print("Choose one: ");
        choice = (char) System.in.read();

        System.out.println("\n");

        switch(choice) {
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condição) instrução;");
                System.out.println("else instrução;");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch(expressão) {");
                System.out.println("  case constante:");
                System.out.println("    sequência de instruções");
                System.out.println("    break;");
                System.out.println("  // ...");
                System.out.println("}");
                break;
            default:
                System.out.print("Seleção não encontrada.");
        }
    }
}
