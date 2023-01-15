package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C05_Arrays {
    public static void main(String[] args) {
        //soru 5 == kullanicidan bir cumle isteyin ve culedeki kelimelerin sayisisni yazdirirn
        String cumle= "Her sey java ile guzzel";
        String kelimeler[]= cumle.split(" ");
        System.out.println(Arrays.toString(kelimeler));
        System.out.println("Girilen cumlede ** "+kelimeler.length+ " ** adet keleime var");


    }
}
