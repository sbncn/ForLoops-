package day21_array;

public class C01_Array {
    public static void main(String[] args) {
        //elemanlari ayse fatma ali veli olan bir array olustur
        String array[]=new String[4];
        array[0]="Ali";
        array[1]="Veli";
        array[2]="Ayse";
        array[3]="Fatma";
        // soru Array deki Ali ismini Can ile Ayse ismini Gul ile degistiriniz?
        String array2[]={"Ali","Veli","Ayse","Fatma"};
        array2[0]="Can";
        array2[2]="Gul";
        System.out.println(array2[array2.length-1]);//fatma yazdirdi
        System.out.println(array[1]);




    }
}
