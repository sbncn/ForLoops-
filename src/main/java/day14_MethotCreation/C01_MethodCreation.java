package day14_MethotCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {
        // verilen sayinin toplamini ve carpimini yapan method olusturun.
       topla(2,4);
       carp(3,2);
       topla(5,6);
    }//main

    private static  void topla(int i,int j) {
        System.out.println("toplama="+ (i+j));

    }
    private static void carp(int i, int j){
        System.out.println("carpma="+i*j);
    }


    }//class






