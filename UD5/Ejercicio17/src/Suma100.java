import java.util.Scanner;

public class Suma100 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int num = s.nextInt();
        int suma=0;
        int i;
        if (num>=0) {
            for (i=1; i<=100; i++) {
                suma+=num+i;
                }
            System.out.println("La suma de los 100 números siguientes es " + suma);
        } else {
            System.out.println("El número introducido no puede ser negativo");
        }
        s.close();
    }
}
