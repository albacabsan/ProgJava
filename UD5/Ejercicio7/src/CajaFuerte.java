import java.util.Scanner;

public class CajaFuerte {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Tienes que abrir una caja fuerte, necesitas la clave, tienes 4 oportunidades.");
        int clave=4521;
        int claveIntroducida;
        int oportunidades=4;
        
        do {
            System.out.println("Te quedan " + oportunidades + " oportunidades, " + "introduce la clave de 4 cifras: ");
            claveIntroducida= s.nextInt();
            if (claveIntroducida==clave) {
                System.out.println("Enhorabuena, has abierto la caja fuerte");
                oportunidades=0;
            } else {
                if (claveIntroducida<1000 || oportunidades>9999) {
                    System.out.println("Te recuerdo que deben ser 4 cifras");
                } else {
                    System.out.println("Lo siento, esa no es la clave");
                }
                oportunidades--;
            }
        } while (oportunidades>0) ;
        s.close();
    }
}
