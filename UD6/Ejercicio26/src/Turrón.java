import java.util.Scanner;

public class Turrón {
    public static void main(String[] args) throws Exception {
        System.out.println("Bocado de forma aleatoria en un turrón.");
        Scanner s = new Scanner(System.in);
        //pedimos al usuario tanto altura como ancho del turrón
        System.out.println("Por favor, introduzca la altura del turrón (como mínimo 4): ");
        int altura=s.nextInt();
        System.out.println("Ahora introduzca la anchura (como mínimo 4): ");
        int ancho=s.nextInt();
        s.close();
        //damos un valor aleatorio a la posición del bocado
        int bocado=(int)(Math.random()*(altura-2)*(ancho-2));
        
        int asterisco=0;
        //hacemos un for para pintar el turrón
        for (int fila=1; fila<=altura; fila++) {
            for (int columna=1; columna<=ancho; columna++) {
                if (fila==1 || fila==altura || columna==1 || columna==ancho) {
                    //vamos contando los asteriscos de los laterales
                    asterisco++;
                    if (asterisco!=bocado) {
                        System.out.print("* ");
                    } else { //cuando del asterisco sea igual a la de bocado, escribirá un espacio
                        System.out.print("  ");
                    }
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}