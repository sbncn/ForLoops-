package siraliOrnekCozumleri;

public class C05_Forloops {
    public static void main(String[] args) {
        // spru 13 e tam bolunen 100den kucuk sayilar ve tolamlarini yazdir
        int toplam=0;

        for (int i = 100; i >0 ; i--) {
            if (i%13==0){
                System.out.println("13 e tam bolunen sayilar="+ i+" ");
                toplam+=i;
            }

        }
        System.out.println("Toplam="+toplam);
    }
}
