package day16_ForLoops;

import java.util.Scanner;

public class C04_ForLoops {
    public static void main(String[] args) {
        // kullanicidan bir string isteyin ve stringi tersten yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir kelime yaziniz");
        String word = scanner.nextLine();
        for (int i = word.length()-1; i >=0 ; i--) {
            System.out.print(word.substring(i,i+1));

        }



    }
}
