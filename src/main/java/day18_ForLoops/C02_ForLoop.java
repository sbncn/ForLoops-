package day18_ForLoops;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
        // kullnicidan 10 dan kucuk bir tam sayi isteyin
        //girdigi sayiya gore asagidaki sekli yazdirin
        //1
        //1 2
        //1 2 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("iki sayi yaziniz yaziniz");
        int num= scanner.nextInt();
        for (int satir = 1; satir <= num; satir++) {
            for (int i = 1; i <=satir ; i++) {
                System.out.print(i+" ");

            }
            System.out.println(" ");
        }
scanner.close();
    }
}
