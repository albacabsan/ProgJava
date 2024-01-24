import java.util.Scanner;

public class Sendero {
    public static void main(String[] args) throws Exception {
        System.out.print("Introduce la longitud del sendero: ");
        Scanner s = new Scanner(System.in);
        int longitud = s.nextInt();
        s.close();
        int num;
        int tope=6;
        int hay_obstaculo;
        int obstaculo;
        int posicion_obstaculo;
        int esp=0;
        for (int j=1; j<=longitud;j++) { //for para imprimir tantas líneas como longitud del sendero
            num=(int)(Math.random()*4)+1;
            if (num==1) {
                tope--; //para desvío a la izquierda
            } else if (num==2) {
                tope++; //para desvío a la derecha
            }
            for (int i=1; i<=tope; i++) {
                System.out.print(" ");
            } //para escribir los espacios anteriores al sendero
            System.out.print("|");
            hay_obstaculo=(int)(Math.random()*2)+1;
            posicion_obstaculo=(int)(Math.random()*4)+1;
            for (int relleno=1; relleno<5; relleno++) { //for para que el relleno sean 4 caracteres
                esp++;
                if (hay_obstaculo==1) { //si hay obstaculo, lo imprime
                    if (posicion_obstaculo==esp) {
                        obstaculo=(int)(Math.random()*2)+1;
                        switch (obstaculo) {
                            case 1:
                                System.out.print("*");
                                break;
                            case 2:
                                System.out.print("O");
                                break;
                            default:
                                break;
                        }
                    } else { //si el obstaculo no está en esa posición, imprime espacio
                        System.out.print(" ");
                    }
                } else { // si no hay obstaculo, imprime espacio
                    System.out.print(" ");
                }
            }
            esp=0;
            System.out.println("|"); //lateral derecho del sendero
        }
    }
}


//2n+1