package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C02_MDArrays {
    public static void main(String[] args) {
        // ic ice konulmus Array lerdir.
        int arr[][]= new int[3][2];// outer Array in 3 elemani (uc tane eleman kumesi) ve her innerda 2 non primitive var
        System.out.println(Arrays.toString(arr));//[[I@2f92e0f4, [I@28a418fc, [I@5305068a] yazdirir
        System.out.println(Arrays.toString(arr[1]));//[0, 0] yazdidi
        System.out.println(Arrays.toString(arr[2]));//[0, 0] yazdidi
        System.out.println(Arrays.deepToString(arr));//[[0, 0], [0, 0], [0, 0]] yazdidi
        arr[0][1]=4;
        arr[1][0]=3;
        arr[2][1]=5;
        System.out.println(Arrays.deepToString(arr));//[[0, 4], [3, 0], [0, 5]]

        int arr2[][]={{0},{1,2,3},{5,6,7,8,9,10}};
        System.out.println(Arrays.deepToString(arr2));//[[0], [1, 2, 3], [5, 6, 7, 8, 9, 10]]
        System.out.println(Arrays.toString(arr2[1]));//[1, 2, 3]
        System.out.println(arr2[2][1]);//6







    }
}
