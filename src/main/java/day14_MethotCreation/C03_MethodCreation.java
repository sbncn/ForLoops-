package day14_MethotCreation;

import java.util.Locale;
import java.util.Scanner;

public class C03_MethodCreation {
    public static void main(String[] args) {
        //kullanicidan iki kelime isteyin
        //iki farkli method olusturun
        //methodlardan biri kelimelri birlestirsin
        //ilk harf buyuk digerlei kucuk olatrak
        //ikincisi ilk harfler buyuk kalan harfler yildiz olsun
        //kullaniciya ismin acik olarak yazilmasi veya gizlenmesi tercihini sorun
        //ve programin kalan kisminda isism ve soy isim kullanicinin istedigi sekilde kullanin

        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen isism ve soyisim giriniz");
        String isim=scanner.next();
        String soyisim=scanner.next();
        System.out.println("isminizin acik yazilmasini istiyorsan 1 "

               + "\\n ilk harf haric gizli istiyorsan 2 ye basiniz");
        int tercih=scanner.nextInt();
        String birlesmisIsim= null ;

        if (tercih==1){birlesmisIsim = acikIsim(isim ,soyisim);
        }else if (tercih==2){
            birlesmisIsim=isimGizle(isim,soyisim);
        }else {
            System.out.println("Lutfen bir veya iki seciniz");
        }

scanner.close();

    }//main

    public static String isimGizle(String isim , String soyisim) {
        isim =isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).replaceAll("\\w","*");


        return isim +" "+soyisim ;
    }

    public static String acikIsim(String isim , String soyisim) {
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();

        return isim +" "+soyisim ;
    }
}
