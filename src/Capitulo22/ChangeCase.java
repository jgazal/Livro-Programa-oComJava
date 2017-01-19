package Capitulo22;

// Demonstra toUpperCase() e toLowerCase().

class ChangeCase {
    public static void main(String[] args) {
        String str = "This is a test.";
        System.out.println("Original: " + str);

        String upper = str.toUpperCase();
        String lower = str.toLowerCase();

        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
    }
}
