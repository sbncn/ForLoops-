package siraliOrnekCozumleri;

import java.util.Scanner;

public class StringManipulation03 {
    public static void main(String[] args) {
        /*kullanicidan email iste
        @ isareti yoksa gecerli email iste
        @ isaretinden sonra gmail.com yaziyorsa geceli mail yaz
        @ isartinden sonra gmail.com yazmiyorsa gmail hesabi iste

         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("mail adresi girin");
        String mail= scanner.nextLine();
       if (!mail.contains("@")){
           System.out.println("gecerli bir mail girin");


    } else if (mail.substring(mail.indexOf("@")+1).equals("gmail.com"))
       {  System.out.println("mail kaydedildi");

       }else {
           System.out.println("gmail hesabi giriniz");
    }
    }
}
