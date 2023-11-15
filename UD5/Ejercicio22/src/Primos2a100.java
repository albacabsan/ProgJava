public class Primos2a100 {
    public static void main(String[] args) throws Exception {
        int num;
        int i;
        boolean esPrimo =true;
        for (num=2; num<=100; num++) {
            esPrimo=true;
            for (i=2; i<num ; i++) {
                if (num%i==0) {
                    esPrimo=false;
                }
            }
            if (esPrimo) {
                System.out.println("El número " + num + " es primo");
                }
        }
        System.out.println();
    }
}
