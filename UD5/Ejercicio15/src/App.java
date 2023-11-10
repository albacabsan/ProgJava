import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        double base;
        int expo;
        double potencia;
        int i;

        System.out.print("Introduce una base: ");
        base = s.nextDouble();
        System.out.print("Introduce un exponente: ");
        expo = s.nextInt();
        
        for (i=0; i<=expo; i++) {
            if (expo==0) {
                potencia=1;
        } else {
                potencia= Math. pow(base, i+1);
        }
        System.out.println(potencia);
        }
        s.close();
    }
}