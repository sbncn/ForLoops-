package day19_WhileLoopDeWhileLoop;

public class C05DoWhileLoop {
    public static void main(String[] args) {
        // m harfinden baslayip c harfine kadar tum harflri yazdir
        // for ile
        for (char i = 'm'; i > 'c'; i--) {// burada int i = m yazarsak askii degerleri elde edriz
            System.out.print(i + " ");

        }//while ile
        char chracter='m';
        while (chracter>'c'){
            System.out.println(chracter + " ");
            chracter--;
        }//do while ile
        char harf = 'm';
        do {
            System.out.println(harf + " ");
            harf--;
        }while (harf>'c');

    }
}
