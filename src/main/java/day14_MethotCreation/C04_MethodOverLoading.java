package day14_MethotCreation;

import java.util.Scanner;

public class C04_MethodOverLoading {
    public static void main(String[] args) {
        /*1- kullanicidan bir syi alin
        2- bu sayinin tek mi cift mi, sifirdan buyuk mu kucuk mu,
        3- ayrica 100 den buyuk ise birler ,onlar, yuzler basamagindaki rakamlarin toplami
        100 den kucuk ise sadece birler basamagini yazdira 3 method olusturun.
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int nummer=scanner.nextInt();

        if(nummer>100){
            System.out.println("topla="+ topla(nummer));
        } else if(nummer<100){
            System.out.println("topla2="+ topla2(nummer));

        }


    }//main
    public static int topla2(int nummer) {
        int topla2=nummer/100;
        return topla2;}

    public static int topla(int nummer) {
        int topla=nummer/100+nummer/10+nummer%2;
        return topla;

    }

    public static boolean buyukMu(int nummer) {
        boolean buyukMu=nummer>100;
        return buyukMu;
    }


    public static void ciftMi(int nummer) {
       boolean ciftMi = nummer%2==0 ;
        System.out.println("cift sayi");

    }


}





