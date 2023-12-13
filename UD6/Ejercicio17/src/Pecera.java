import java.util.Scanner;

public class Pecera {
    public static void main(String[] args) throws Exception {
        System.out.println("Pecera con un pez dentro en posición aleatoria.");
        Scanner s = new Scanner(System.in);
        //pedimos al usuario tanto altura como ancho de la pecera
        System.out.println("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
        int altura=s.nextInt();
        System.out.println("Ahora introduzca la anchura (como mínimo 4): ");
        int ancho=s.nextInt();
        s.close();
        //damos un valor aleatorio a la posición del pez
        int pez=(int)(Math.random()*(altura-2)*(ancho-2));
        int espacio=0;
        //hacemos un for para pintar la pecera
        for (int fila=1; fila<=altura; fila++) {
            for (int columna=1; columna<=ancho; columna++) {
                if (fila==1 || fila==altura || columna==1 || columna==ancho) {
                    System.out.print("* ");
                } else {
                    //establecemos que vaya contando cada espacio
                    espacio++;
                    if (espacio!=pez) {
                        System.out.print("  ");
                    } else { //cuando el número del espacio sea el número de la posición del pez, pinta el pez
                        System.out.print("& ");
                    }
                }
            }
            System.out.println();
        }
    }
}
