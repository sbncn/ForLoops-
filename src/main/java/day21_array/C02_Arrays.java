package day21_array;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,78,89};
        // array in tum elemanlarini yazdiralim
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
            System.out.print(Arrays.toString(arr));//bu kisa yol array in icicndekileri yazdirir



    }
}
