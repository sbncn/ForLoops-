package day19_WhileLoopDeWhileLoop;

import java.util.Scanner;

public class C01DeWhileLoop {
    public static void main(String[] args) {
        //kullanicidan bir sayi alin
        // ve bu sayiyi tam bolen sayilari ve toplan kac tane olduklarini ekrana yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayi yaziniz");
        int sayi = scanner.nextInt();
        int sayac=0;
        int bolen=1;
        while (bolen<=sayi){
            if (sayi%bolen==0){
                System.out.print(bolen+" ");
                sayac++;
            }
            bolen++;
        }
        System.out.println("");
        System.out.println(sayi+ "    sayisinin   " + sayac + "  adet tam boleni vardir");
        scanner.close();

    }
}
