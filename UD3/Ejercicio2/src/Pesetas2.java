import java.util.Scanner;

public class Pesetas2 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);


        System.out.print("Por favor, introduce un número de euros: ");
        double num_euros= s.nextDouble();
        double pesetas= (double) num_euros*(166.386);
        System.out.println(num_euros + " euros son " + pesetas + " pesetas");
        s.close();
    }
}
