package Capitulo23;

// Tente Isto 23-1

class Finder {
    public static <T extends Comparable<T>> T minElement(T[] data) {
        T currMin = data[0];
        for(T x : data) {
            if (x.compareTo(currMin) < 0)
                currMin = x;
        }
        return currMin;
    }
}

class MinElementDemo {
    public static void main(String[] args) {
        Integer[] intArray = { 3, 1, 4, 3, 6, 5};
        int intMin = Finder.minElement(intArray);
        System.out.println(intMin);

        String[] strArray = {"every", "good", "boy", "does", "fine"};
        String strMin = Finder.minElement(strArray);
        System.out.println(strMin);

        Double[] doubleArray = {3.14, 2.8, 6.023, 1.414};
        Double doubleMin = Finder.minElement(doubleArray);
        System.out.println(doubleMin);
    }
}
