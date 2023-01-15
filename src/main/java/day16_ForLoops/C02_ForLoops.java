package day16_ForLoops;

import java.util.Scanner;

public class C02_ForLoops {
    public static void main(String[] args) {
        // kullanicidan 100 den kucuk bir sayi aliniz.
        // 1 den baslayip sayiya kadar 3 ve 5 in katlarini yazdirin.
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        double num = scanner.nextDouble();
        int sayi = (int) num;
        //sayi negatif ise veya tam sayi degilse uyari verelim

        if (num < 0) {
            System.out.println("negatif sayi giremezsiniz");
        } else if (sayi != num) {
            System.out.println("Lutfen tam sayi giriniz");

        } else if (num > 100) {
            System.out.println("100 de kucuk bir sayi giriniz");

        } else {
            for (int i = 1; i <= num; i++) {
                if (i % 3 == 0 || i%5==0 ) {
                    System.out.print(i + " ");
                }}
            scanner.close();


        }

    }//main
}//class

