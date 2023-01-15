package day16_ForLoops;

import java.util.Scanner;

public class C05_ForLoops {
    public static void main(String[] args) {
        // kullanicidan bir string isteyin ve stringi tersten yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir kelime yaziniz");
        String str = scanner.nextLine();
        System.out.println(tersineCevir(str));
scanner.close();
        }

    public static String tersineCevir(String str) {
        String tersStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            tersStr += str.substring(i, i + 1);

        }

        return tersStr;

    }


}



