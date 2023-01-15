package day16_ForLoops;

import java.util.Scanner;

public class C07_ForLoops {
    public static void main(String[] args) {
        //kullanicidan iki sayi al
        //girilen sayilar ve  arasindaki sayilari topla
        //sonucu yazdir
        // kullanicidan bir string isteyin ve stringi tersten yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("iki sayi yaziniz yaziniz");
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        int kucuk =0;
        int buyuk=0;
        if (num1>num2){
            num1=buyuk;
            num2=kucuk;
        }else {
            kucuk=num1;
            buyuk=num2;
        }
        int toplam=0;
        for (int i = kucuk; i <=buyuk; i++) {
            toplam+=i;

        }
        System.out.println("girilen sayilar ve arasindakiler toplami="+ toplam);
scanner.close();

    }
}
