package day21_array;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
        // example==>verilen Array in tum elemanlarini bir soldaki konuma tasiyacak program yaziniz
        //ornek array[1,2,3] ise output[2,3,1] olacak
        int arr[]={1,2,3,4,5};
        int kova=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=arr[i+1];

        }
        arr[arr.length-1]=kova;
        System.out.println(Arrays.toString(arr));
    }
}
