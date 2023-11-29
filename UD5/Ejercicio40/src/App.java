import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Dime la altura del rombo: ");
        int altura_ini= s.nextInt();
        int esp_dentro=0;
        int esp_fuera=altura_ini/2;
        int i;
        int alt=1;

        if ((altura_ini < 3) || (altura_ini % 2 == 0)) {
            System.out.println("ERROR DE ALTURA");
            } else {
            // parte de arriba /////////////////////////////////////
            while (alt <= altura_ini / 2 + 1) {
            // inserta espacios delante
                for (i = 1; i <= esp_fuera; i++) {
                    System.out.print(" ");
                    System.out.print("*");
                for (i = 1; i < esp_dentro; i++) {
                    System.out.print(" ");
                }
                if (alt>1) {
                System.out.print("*");
                }
                System.out.println();
                alt++;
                esp_fuera--;
                esp_dentro+=2;
            }
            // parte de abajo /////////////////////////////////////
            esp_dentro = altura_ini - 3;
            esp_fuera = 1;
            alt = 0;
            while (alt < altura_ini / 2) {
            // inserta espacios delante
            for (i = 1; i <= esp_fuera; i++) {
            System.out.print(" ");
            }
            // pinta la línea
            System.out.print("*");
            for (i = 1; i < esp_dentro; i++) {
            System.out.print(" ");
            }
            if(alt < altura_ini / 2 - 1) {
            System.out.print("*");
            }
            System.out.println();
            alt++;
            esp_fuera++;
            esp_dentro -= 2;
            } // while parte de abajo ///////////////////////
            } // else

        }
    }
}
