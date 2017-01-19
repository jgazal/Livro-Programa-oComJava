package Capitulo3;

class Break5 {

    public static void main(String[] args) {

        done:
        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                for(int k=0; k<10; k++) {
                    System.out.println(k + " ");
                    if(k == 5) break done; // jump to done
                }
                System.out.println("Após o loop de k"); // won't execute
            }
            System.out.println("Após o loop de j"); // won't execute
        }
        System.out.println("Após o loop de i");
    }
}
