package day20_scope;

public class InstanceVar {
    String adres="ankara";
    String dogumYeri;
    double notOrtalamasi;
    double yasOrtalamasi=12.3;
    char cinsiyet='E';
    char chracter;
    boolean ogrenciMi;
    boolean izinliMi;


    public static void main(String[] args) {
        InstanceVar ali=new InstanceVar();//bu cumleyi yazinca yukarida olusturdugumuz tum variableleri cagirabiliriz
        System.out.println(ali.adres);// sout parantezine( ali. yazinca yukaridaki tum varableleri goruruz



    }
    public static  void ststicMethod(){// burasi static oldugu icin obje olusturmadan goremeyiz

    }
    public  void staticOlmayan(){// burasi static olmadigi icin burada calisir

    }
}
