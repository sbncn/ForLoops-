package day22_arrays;

import java.util.Arrays;

public class C03_Split {
    public static void main(String[] args) {
        // soru== "Java ogrendim,  #cok para ?kazandim.,"
        //cumlesinin kelimelerini ozel karakterler ve noktalama isaretleri olmadan
        // harf sirasina gore yazdirin
        String zin="Java ogrendim, #cok para ?kazandim";
        String worden[]=zin.split(" ");
        System.out.println(Arrays.toString(worden));

        for (int i =0; i < worden.length ; i++) {
            worden[i]=worden[i].replaceAll("\\W","");// \\w kucuk w yazinca sadece karakterler kaliyor
            System.out.println(worden[i]);}                            // kelimeleri yazdirmiyor. W buyul olusa kelimeleri
                                                                      // yaziyor karakterleri yazmiyor
        System.out.println(Arrays.toString(worden));
        Arrays.sort(worden);

    }
}
