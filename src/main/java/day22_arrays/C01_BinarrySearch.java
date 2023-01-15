package day22_arrays;

import java.util.Arrays;

public class C01_BinarrySearch {
    public static void main(String[] args) {
        String names[]={"Hacer","ainagul","Emine","Murat","Kutlu"};
        // isimler array de murat ismi varmi
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));// askii degerlere gore siralama yapar.sayi olsa 1234 gib siralar
        // ainagul ismini kucultuyoruz
        names[4]="Ainagul";
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        System.out.println(Arrays.binarySearch(names,"Murat"));
        System.out.println(Arrays.binarySearch(names,"Mehmet"));
        System.out.println(Arrays.binarySearch(names,"Tugba"));
        System.out.println(Arrays.binarySearch(names,"Kursat"));




    }
}
