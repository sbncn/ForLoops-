package day18_ForLoops;

public class C05_WhileLoop {
    public static void main(String[] args) {
        //forloop ve whileloop ile yapiniz
        //3 basamakli sayilardan 15 20 ve 90 tam bolunen sayilari bulunuz

        for (int i = 100; i <1000 ; i++) {
            if (i%15==0 && i%20==0 && i%90==0){
                System.out.println(i);
            }

        }
        int i=100;
        while (i<1000) {
            if (i % 15 == 0 && i % 20 == 0 && i % 90 == 0) {
                System.out.println(i);
                i++;

            }
        }
    }
}
