package day23_multiDimensionalArrays;

public class C04_MDArrays {
    public static void main(String[] args) {
        //soru 2  MD Array in ic array indaki son elemanlarin carpimini yazdirin
        // {{1,2,3},{4,5},{6}}
        int arr[][]={{1,2,3},{4,5},{6,3}};
        int sonuc=1;

        for (int i = 0; i < arr.length; i++) {
            int sonElemanIndex=arr[i].length-1;
            sonuc*=arr[i][sonElemanIndex];

        }
        System.out.println(sonuc);//90//45
    }
}
