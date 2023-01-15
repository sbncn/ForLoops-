package day16_ForLoops;

import java.util.Scanner;

public class C08_ForLoops {
    public static void main(String[] args) {
        // kullanicidan 10 dan kucuk bir sayi alin
        // girilen sayinin faktoriyelini bulunuz faktoriyel==carpimlari demektir 5!=5*4*3*2*1
        Scanner scanner = new Scanner(System.in);
        System.out.println("10 dan kucuk bir sayi yaziniz yaziniz");
        int num= scanner.nextInt();
        System.out.print(num +"!=");
        int faktoriyel =1;
        for (int i = num; i >1 ; i--) {
            faktoriyel*=i;
            System.out.print(i+"+");

        }
        System.out.println("1="+faktoriyel);
scanner.close();
    }
}
