package day16_ForLoops;

import java.util.Scanner;

public class C06_ForLoops {
    public static void main(String[] args) {

        // kullanicidan bir string isteyin ve stringin palindrome olup olmadigini kontrol ediniz.
        //palindroma == tersten de ayni okunus demek . aya-madam-1234321 gibi
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir kelime yaziniz");
        String str = scanner.nextLine();
        if (str.equals(tersineCevir(str))){
            System.out.println("girdiginiz string palindroma");

    }else {
            System.out.println("girdiginiz string palindroma degil");}}

    public static String tersineCevir(String str) {
        String tersStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            tersStr += str.substring(i, i + 1);

        }

        return tersStr;


    }
}
