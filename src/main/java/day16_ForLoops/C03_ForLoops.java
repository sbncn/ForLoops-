package day16_ForLoops;

import java.util.Scanner;

public class C03_ForLoops {
    public static void main(String[] args) {
        // soru 6. kullanicidan 100den kucuk pozitif sayi aliniz
        //-1 den baslayip girilen sayiya kadar tum sayilari yazdirin.
        //-ancak sayi 3 un kati ise "java" yazdirin
        //-5 in kati isde sayi yerine " guzeldir "yazdirin
        //-sayi hem 3 un hemde 5 in kati ise "Java guzeldir " yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int num = scanner.nextInt();
        for (int i = 1; i<=num; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Java Guzeldir");
            } else if (i % 3 == 0) {
                System.out.println("Java");

            } else if (i % 5 == 0) {
                System.out.println("Guzeldir");
            } else {


                System.out.println(i);

            }scanner.close();
        }
    }//main
}//class
