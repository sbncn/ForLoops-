package day22_arrays;

import java.util.Arrays;

public class C02_Split {
    public static void main(String[] args) {
        //"Java ogrenmek guzeldir." cumlesinin kelimelerini tersten yazdirin
        String cumle="Java ogrenmek guzeldir";
        String kelimeler[]=cumle.split(" ");
        System.out.println(Arrays.toString(kelimeler));
        for (int i = kelimeler.length-1; i >=0 ; i--) {
            System.out.print(kelimeler[i]+" ");

        }

    }
}
