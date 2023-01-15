package siraliOrnekCozumleri;

import java.util.Scanner;

public class C10_ForLoop {
    public static void main(String[] args) {
        //2 boyutlu bir tablo olarak, ekrana carpim tablosunu hesaplayip yazan kodu yaziniz
        Scanner scanner = new Scanner(System.in);
        System.out.println("carpim tablosu boyutunu giriniz=");
        int boyut= scanner.nextInt();
        for (int i = 1; i <=boyut ; i++) {
            for (int j = 1; j <=boyut ; j++) {
                System.out.print(" "+i * j);

            }
            System.out.println();
        }
    }
}
