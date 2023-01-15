package siraliOrnekCozumleri;

public class C06_ForLoop {
    public static void main(String[] args) {
        // 0 - 255 e kadar harflerin sayi ve harf degerlerini konsola yazdir.
        for (int i = 0; i <= 255; i++) {
            char harf=(char) i;// burada data casting var. i int oldugundan char sigmaz. casting yaptik.
            System.out.println(i +"-"+ harf);


        }
    }
}
