import java.util.Scanner;

public class Euros2 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.print("Por favor, introduce un número de pesetas: ");
        double num_pesetas= s.nextDouble();
        double euros= (double) num_pesetas/(166.386);
        System.out.println(num_pesetas + " euros son " + euros + " pesetas");
        s.close();
    }
}