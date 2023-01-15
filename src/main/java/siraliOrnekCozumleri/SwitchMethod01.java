package siraliOrnekCozumleri;

import java.util.Scanner;

public class SwitchMethod01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("donusturulecek bir birim giriniz");
        String birim=scanner.next();
        System.out.println("bir miktar giriniz");
        Double miktar=scanner.nextDouble();
        cevir(birim,miktar);

    }

    private static void cevir(String brm, Double mktr) {
        switch (brm){
            case "saat":
                System.out.println("girilen saatin saniye degeri="+mktr*60*60);
            break;
            case "mil":
                System.out.println("girilen milin km degeri="+mktr*1.6);
                break;
            case "kg":
                System.out.println("girirlen kg min gr degeri="+mktr*1000);
                break;
            default:
                System.out.println("yanlis bir birim girdiniz");


            }
        }
    }


