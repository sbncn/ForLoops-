package siraliOrnekCozumleri;

import java.util.Scanner;

public class MethodCreation02 {
    public static void main(String[] args) {
        /*
        addDigits isminde bir method olusturun
        parametresi int olsun, return tipi int,
        pozitif int degerler ver ve enson sonuc tek basamakli cikana kadar basamaklari birbiriyle topla
        tek basakli ciktiginda dondur
        ornek==
        girdi=38
        cikti =2
         acaiklama islem soyle olacak==> 3+8=11, 1+1=2(2 sonucu tek basamakli oldugunda dondurun)
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int num = scanner.nextInt();
        aadDigits(num);

    }

    private static int aadDigits(int num) {
        for (int i = 0; i < 5; i++) {
            num=sum(num);// -num- methodu icinde tekrar -sun- adinda method olusturduk
            if(num<10)
                break;

        }
        return num;
    }
    private static int sum(int num){
        int tolam = 0;
        int rakam= 0;
        while (num>0){
            rakam=num%10;
            tolam+=rakam;
            num/=10;
        }
        System.out.println("girdiginiz sayinin rakamlari toplami="+ tolam);
        return tolam;
    }


}
