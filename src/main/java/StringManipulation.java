import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        //kulanicidan birisim alin isim sadece uc harfli olmalisdir ternary kullanarak harflerin unique(farkli)
        //olup olmadigina bakiniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isim yaziniz");
        String name=scan.nextLine();
        System.out.println("***if ile****");
        char c1=name.charAt(0);//ismin ilk harfini alacak
        char c2=name.charAt(1);//ismin ilk harfini alacak
        char c3=name.charAt(2);//ismin ilk harfini alacak

        if (name.length()==3){
            if (c1!=c2&&c2!=c3&&c3!=c1){
                System.out.println("isim uc harli ve unique");
            }else {
                System.out.println("isim uc harfli ama unique degil");}
        }else {
            System.out.println("isim uc harli degil");
            System.out.println("*****ternary ile*******");
        }
    }}

