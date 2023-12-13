public class Aleatorios20 {
    public static void main(String[] args) throws Exception {
        System.out.println("20 números aleatorios entre 0 y 10: ");
        for (int i=1; i<=20; i++) {
            System.out.print((int)(Math.random()*11) + " ");
        }
    }
}

