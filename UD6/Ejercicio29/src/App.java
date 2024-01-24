import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("1. Primavera");
        System.out.println("2. Verano");
        System.out.println("3. Otoño");
        System.out.println("4. Invierno");
        System.out.println("Seleccione la estación del año (1-4): ");
        Scanner s = new Scanner(System.in);
        int estacion=s.nextInt();
        s.close();
        int tempmin=0;
        int tempmax=0;
        System.out.println();
        System.out.println("Previsión del tiempo para mañana");
        System.out.println("---------------------------------");
        if (estacion==1) {
            tempmin=(int)(Math.random()*31)+15;
            tempmax=(int)(Math.random()*31)+tempmin;
        } else if (estacion==2) {
            tempmin=(int)(Math.random()*46)+25;
            tempmax=(int)(Math.random()*46)+tempmin;
        } else if (estacion==3) {
            tempmin=(int)(Math.random()*30)+20;
            tempmax=(int)(Math.random()*31)+tempmin;
        } else if (estacion==4) {
            tempmin=(int)(Math.random()*26);
            tempmax=(int)(Math.random()*26)+tempmin;
        }
        System.out.println(tempmin);
        System.out.println(tempmax);
    }
}
