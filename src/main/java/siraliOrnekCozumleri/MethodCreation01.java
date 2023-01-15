package siraliOrnekCozumleri;

import java.util.Scanner;

public class MethodCreation01 {
    public static void main(String[] args) {
        /*  name1 ve name2 degiskenlerini olusturun
        name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yerlestirin
        name1 degiskeninin karakter sayisi tek ise name1 karakterinin ortasi olmadigi icin yerlesmez diyen mothod olustur
        e.g;
        name1= mehmet
        name2 = ahmet
        print= mehahmetmet

         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("name1 giriniz");
        String name1=scanner.next();
        System.out.println("name2 giriniz");
        String name2=scanner.next();
        ortasnaEkle(name1,name2);

    }

    private static void ortasnaEkle(String n1, String n2) {
        if (n1.length()%2==0){
            System.out.println(n1.substring(0,n1.length()/2)+n2+n1.substring(n1.length()/2));
    }else {
            System.out.println("name1 cift karakter olmadigi icin ortsina isim yerlesmez");
        }
}}
