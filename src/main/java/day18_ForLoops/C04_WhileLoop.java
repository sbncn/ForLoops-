package day18_ForLoops;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {
        //kullanicidan toplamak uzere sayi isteyin
        // kulanici sifira basincaya kadar sayilari alip toplayip yazdirin
        Scanner scan = new Scanner(System.in) ;
        int sayi =1;// bu soruda islam kullanici 0 a basinca bitecegi icin sayiya 0 degeri vermiyecegiz
        int topla=0;
        int sayac=0;
        while (sayi!=0) {
            System.out.println("lutfen tam sayi giriniz\n bitirmek icin sifir giriniz");
            sayi = scan.nextInt();
            topla += sayi;
            sayac++;


        }
        //kullanici 0 a bastiginda loop islemi son kez yapacak
        //sonra bas donecek ve islem bitecek
        System.out.println("Girilen sayi adedi="+(sayac-1));
        System.out.println("Girilen sayilar toplami="+ topla);
    }
}
