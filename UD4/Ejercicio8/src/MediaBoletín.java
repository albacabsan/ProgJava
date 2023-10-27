import java.util.Scanner;

public class MediaBoletín {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Dime la primera nota: ");
        double primera = s.nextDouble();
        System.out.print("Dime la segunda nota: ");
        double segunda = s.nextDouble();
        System.out.print("Dime la tercera nota: ");
        double tercera = s.nextDouble();
        double media = (primera + segunda + tercera)/3;
        System.out.println("La media de las 3 notas es: " + media);
        
        if (media<5) {
            System.out.println("Tu nota es insuficiente");
        }
        if (media>4 && media<6) {
            System.out.println("Tu nota es suficiente");
        }
        if (media>5 && media<7) {
            System.out.println("Tu nota es bien");
        }
        if (media>6 && media<9) {
            System.out.println("Tu nota es notable");
        }
        if (media>8 && media<=10) {
            System.out.println("Tu nota es sobresaliente");
        }
        s.close();
    }
}
