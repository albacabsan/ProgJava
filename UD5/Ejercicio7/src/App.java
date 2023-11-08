import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Tienes que abrir una caja fuerte, necesitas la clave, tienes 4 oportunidades");
        int clave=4521;
        int claveIntroducida;
        int oportunidades;

        for (oportunidades=4; oportunidades>0; oportunidades-=1){
            System.out.println("Te quedan " + oportunidades + " oportunidades, " + "introduce la clave de 4 cifras: ");
            claveIntroducida= s.nextInt();
            if (claveIntroducida!=clave) {
                System.out.println("Lo siento, esa no es la clave");
            } else {
            System.out.println("Enhorabuena, has abierto la caja fuerte");
            oportunidades=0;
            } 
        } 
        s.close();
    }
}
