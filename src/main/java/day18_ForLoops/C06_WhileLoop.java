package day18_ForLoops;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {
        //kullanicidan toplamak icin sayilar isteyin
        //sayi adaedi 10 nu gecerse veya tolam 500 u gecerse
        //bu kadar sayi yeter yazdirin
        // kac adet sayi girildigini ve toplamini yazin
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen  bir sayi veya sayilar giriniz yaziniz yaziniz");

         int num = 1;
        int sayac=0;
        int toplam=0;
    while (num!=0){
        System.out.println("sayi girin");
        num = scanner.nextInt();
        toplam+=num;
        sayac++;

    if (toplam>500 || sayac>10){
        System.out.println("fazla sayi girdiniz");

    }}

        System.out.println("toplam="+ toplam);
        System.out.println("sayac="+sayac);
        scanner.close();
    }
}
