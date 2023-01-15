package day18_ForLoops;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {
        //kullanicidan iki tam sayi isteyiniz
        //ilk sayidan baslayip ikinci sayiya kadar 3 er 3er yazdirin
        //ikinci sayi dahil olmak zorunda ddegil
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen iki tam sayi yaziniz yaziniz");
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        if (num1>num2){
            for (int i = num1; i >num2 ; i-=3) {// 3 er 3 er aaltmak icin i++ yerine i-=3 yazacagiz
                System.out.print(i + " ");
            }
       } else if (num2>num1) {
            for (int i = num1; i < num2; i+=3) {
                System.out.print(i+ " ");

            }

        }else {
            System.out.println("esit sayi girdiniz");
        }scanner.close();
    }
}


