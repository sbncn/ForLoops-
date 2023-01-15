package day23_multiDimensionalArrays;

public class C03_MDArrays {
    public static void main(String[] args) {
        // asagidaki m d Arrayi elemanlarinin carpimini ekerana yazdirin
        //{{1,2},{4,5,6,7}}
        int arr[][] = {{1, 2}, {4, 5}, {4, 5, 6, 7}, {1}};
        carpimYazdir(arr);
    }

    private static void carpimYazdir(int[][] arr) {



    int carp=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                carp*=arr[i][j];
            }

        }
        System.out.println(carp);
    }}

