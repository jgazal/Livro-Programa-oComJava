package Capitulo5;

//Usa XOR para codificar e decodificar uma mensagem

class SimpleCipher {

    public static void main(String[] args) {
        String msg = "This is a test";
        String encMsg = "";
        String decMsg = "";
        int key = 88;

        System.out.print("Original message: ");
        System.out.println(msg);

        //codifica a mensagem
        for(int i=0; i < msg.length(); i++)
            encMsg = encMsg + (char) (msg.charAt(i) ^ key);

        System.out.print("Encoded message: ");
        System.out.println(encMsg);

        //decodifica a mensagem
        for(int i=0; i < msg.length(); i++)
            decMsg = decMsg + (char) (encMsg.charAt(i) ^ key);

        System.out.print("Decoded message: ");
        System.out.println(decMsg);
    }
}
