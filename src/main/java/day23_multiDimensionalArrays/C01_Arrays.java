package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        //verilen bir Array den istenen degere sahip elemntleri silip
        //kalani yeni bir Array olarak kaydedin ve yazdirin
        int arr[] ={3,5,6,3,2,4,};
        int silinecekElemanlar=5;// silmek istedigimiz sayiyi yaziyoruz
        // Array lerin elemanlari silinemez ve eleman eklenemez
        // ama yeneiden olusturulabilire
        int sayac=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==silinecekElemanlar){
                sayac++;
            }

        }
        System.out.println(sayac);// kac sayi sildigini gosterir
        int yeniArrayUzunluk=arr.length-sayac;
        //artik yeni Array i olusturalim
        int yeniArr[]=new int[yeniArrayUzunluk];
        int index =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=silinecekElemanlar){
                yeniArr[index]=arr[i];
                index++;
            }

        }
        System.out.println(Arrays.toString(yeniArr));// yeni Array i yazdirir
    }
}
