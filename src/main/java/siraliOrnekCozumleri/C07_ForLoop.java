package siraliOrnekCozumleri;

import java.util.Locale;
import java.util.Scanner;

public class C07_ForLoop {
    public static void main(String[] args) {
        // girilen string deki a harfi sayisini bulunuz ama c harfine gelirse donguden ciksin
        // Bugun hava oldukca guzel.
        Scanner scan=new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str= scan.nextLine();
        int aMiktari=0;

        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i)=='a'){
                aMiktari++;
            }else if (str.toLowerCase().charAt(i)=='c'){
                break;
            }

        }
        System.out.println("srtingdeki a harfi sayisi="+ aMiktari);//bu isi bu sene insallah basaracagim.
        //   srtingdeki a harfi sayisi=5


    }
}
