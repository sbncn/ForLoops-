package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C06_Arrays {
    public static void main(String[] args) {
        //verilen iki Array i birlestiren
        // ve sonucunu birlesikArray isminde bir Array a kaydeden
        // bir metdod olusturunuz
        int arr1[]={3,5,};
        int arr2[]={2,4,6};
        int birlesikArray[]= birlestir(arr1,arr2);
        Arrays.sort(birlesikArray);//sort arrayi siralar
        System.out.println(Arrays.toString(birlesikArray));//3,5,0,0,0 oldu. daha sadece arr1 atadik
    }

    private static int[] birlestir(int[] arr1, int[] arr2) {
        int birlesikArray[]=new int[arr1.length+ arr2.length];//
        for (int i = 0; i < arr1.length ; i++) {// arr1 elemanlarini birlesikArray a atadik.
            birlesikArray[i]=arr1[i];


        }
        for (int i = 0; i < arr2.length; i++) {//ikinci Array in elemanlari
            birlesikArray[i+ arr1.length]= arr2[i];

        }
        return birlesikArray;
    }
}
