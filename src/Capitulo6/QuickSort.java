package Capitulo6;

//Uma versão simples da classificação rápida

class Quicksort {

    //Define uma chamada ao método real de classificação rápida
    static void qsort(char[] items) {
        qs(items, 0, items.length-1);
    }
    //Uma versão recursiva da classificação rápida para caracteres
    private static void qs(char[] items, int left, int right) {
        int i, j;
        char x, y;

        i = left; j = right;
        x = items[(left+right)/2];

        do {
            while((items[i] < x) && (i < right)) i++;
            while((x < items[j]) && (j > left)) j--;

            if(i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++; j--;
            }
        } while(i <= j);

        if(left < j) qs(items, left, j);
        if(i < right) qs(items, i, right);
    }
}
class QSDemo {
    public static void main(String[] args) {
        char[] a = { 'd', 'x', 'a', 'r', 'p', 'j', 'i' };
        int i;

        System.out.print("Original array: ");
        for(i=0; i < a.length; i++)
            System.out.print(a[i]);

        System.out.println();

        //agora, classifica o array
        Quicksort.qsort(a);

        System.out.print("Sorted array: ");
        for(i=0; i < a.length; i++)
            System.out.print(a[i]);
    }
}

