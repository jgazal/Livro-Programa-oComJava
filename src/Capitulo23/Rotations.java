package Capitulo23;

// Demonstra rotateLeft() e rotateRight()

class Rotations {
    public static void main(String[] args) {
        int num = -3356756;

        System.out.println(Integer.toBinaryString(num));

        num = Integer.rotateLeft(num, 2);
        System.out.println(Integer.toBinaryString(num));

        num = Integer.rotateRight(num, 2);
        System.out.println(Integer.toBinaryString(num));
    }
}