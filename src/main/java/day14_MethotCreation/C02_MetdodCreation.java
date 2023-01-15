package day14_MethotCreation;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class C02_MetdodCreation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");
        double number1=scanner.nextDouble();
        double number2=scanner.nextDouble();
        kupTopla(number1,number2);
        kareTopla(number1,number2);
scanner.close();
    }//main

    public static void kareTopla(double i, double j) {
        double sayilarKarelerTolami= i*i + j*j;
        System.out.println("kareToplami="+ sayilarKarelerTolami);
    }
    public static void kupTopla(double i, double j) {
        double sayilarKupleriTolami= i*(i*i) +j*( j*j);
        System.out.println("kupToplami="+ sayilarKupleriTolami);

}
}
