package day21_array;

import java.util.Arrays;

public class C04_Arrays {
    public static void main(String[] args) {
        //verilen Array in tum elemanlarini toplayan programi giriniz

        int arr[]={3,4,5,6,70};
        int topla=0;
        for (int i = 0; i < arr.length; i++) {
            topla+=arr[i];

        }
        System.out.println("Toplam="+ topla);
// bu array ters yazdirmak istersek ayni uzunlukta yeni bir array olusturup elemanlari ters siralayalim
        int tersArr[]=new int[arr.length];
        for (int i = 0; i < tersArr.length; i++) {
            tersArr[i]=arr[arr.length-1-i];

        }
        System.out.println(Arrays.toString(tersArr));
    }
}
