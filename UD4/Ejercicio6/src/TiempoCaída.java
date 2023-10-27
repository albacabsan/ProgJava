import java.util.Scanner;

public class TiempoCaída {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Dime la altura: ");
        double altura = s.nextDouble();
        double g= 9.81;
        double tiempo = Math. sqrt((2*altura)/g);
        System.out.println("El tiempo que tarda en caer es " + tiempo);
        s.close();
    }
}
