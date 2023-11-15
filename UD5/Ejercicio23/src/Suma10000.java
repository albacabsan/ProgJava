import java.util.Scanner;

public class Suma10000 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime números positivos: ");
        int num=0;
        int suma=0;
        int i=0;
        double media;
        
        do {
            num = s.nextInt();
            i++;
            suma+=num;
        } while (suma<=10000);
        media = suma/(i);
        System.out.println("El total acumulado es " + suma);
        System.out.println("El contador de los números es " + i);
        System.out.println("La media de los números introducidos es " + media);
        s.close();
    }
}
