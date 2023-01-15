package siraliOrnekCozumleri;

import java.util.Scanner;

public class StringManipulation02 {// kullanicidan alacaginiz stringde bos olup oladigini kontrol et.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Str yaziniz");
        String str=scan.nextLine();
        boolean boslukVarMi= str.contains(" ");
        System.out.println("stringde bosluk var mi="+boslukVarMi);
        System.out.println("girilen string bos mu="+str.isEmpty());
    }
}
