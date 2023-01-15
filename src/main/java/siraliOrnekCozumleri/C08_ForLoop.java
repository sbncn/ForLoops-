package siraliOrnekCozumleri;

import java.util.Scanner;

public class C08_ForLoop {
    public static void main(String[] args) {
        // kullanicidan 5 adet sayi aloiniz
        //bu sayilardan 5 ile 10 arasindakiler haric digerlerinin toplamini bulunuz
        //bu soruyu contineu kullanarak cozun
        Scanner scan=new Scanner(System.in);
        int toplam=0;

        for (int i = 1; i <6 ; i++) {
            System.out.println("Sayi "+ i +" Giriniz");
            int sayi=scan.nextInt();
            if (sayi>5 && sayi<10){
                System.out.println("sayi 5 ile 10 arasinda ise isleme alinmaz");
                continue;// bunu arastir(yok saymak. bir veriyi isleme almadan tekrar isleme devam et. pas gec gibi

        }
            toplam+=sayi;

    }
        System.out.println("Sayilar toplami="+ toplam);
}}
