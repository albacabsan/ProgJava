public class NúmerosA24 {
    public static void main(String[] args) throws Exception {
        System.out.println("Números aleatorios hasta que salga 24.");
        int num;
        int intentos=0;
        do {
            num=(int)(Math.random()*101);
            if (num%2==0) {
                System.out.println(num);
                intentos++;
            }
        } while (num!=24);
        System.out.println("Se han generado " + intentos + " números");
    }
}
