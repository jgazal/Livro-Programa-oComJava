package Capitulo2;

class LtoD {

    public static void main(String[] args) {
        long longVar;
        double doubleVar;

        longVar = 100123285L;
        doubleVar = longVar;    //Conversão automática de long para double

        System.out.println("longVar e doubleVar: " + longVar + " " + doubleVar);
    }
}
