import java.util.Scanner;

public class BuscaTesoro {
    static final int VACIO = 0;
    static final int MINA = 1;
    static final int TESORO = 2;
    static final int INTENTO = 3;
    public static void main(String[] args) {
    // Se definen constantes para representar el contenido de las celdas
    int[][] juego = new int[4][5];
    int x;
    int y;

    int MinaX=(int)(Math.random()*4);
    int MinaY=(int)(Math.random()*5);
    juego[MinaX][MinaY]=MINA;

    int TesoroX=(int)(Math.random()*4);
    int TesoroY=(int)(Math.random()*5);
    juego[TesoroX][TesoroY]=TESORO;
    
    //introduce los números en el array
        for (x=3; x>=0; x--) {
            System.out.printf("%d|", x);
            for (y=0; y<5; y++) {
                juego[x][y]=VACIO;
            }
            System.out.println();
        }
        // muestra suma de columnas
        System.out.println(" -----------");
        for(y= 0; y < 5; y++) {
            System.out.printf(" %d",y);
        }
        System.out.println();

        Scanner s = new Scanner(System.in);
        System.out.print("Coordenada x: ");
        int filaUsu=s.nextInt();
        System.out.print("Coordenada y: ");
        int columnaUsu=s.nextInt();
        juego[filaUsu][columnaUsu]=INTENTO;

        System.out.println(MinaX);
        System.out.println(MinaY);

        while ((TesoroX!=filaUsu && TesoroY!=columnaUsu) || (MinaX!=filaUsu && MinaY!=columnaUsu)) {
            System.out.println("Coordenada x: ");
            filaUsu=s.nextInt();
            System.out.println("Coordenada y: ");
            columnaUsu=s.nextInt();
        }
        String c = "";
        switch (juego[x][y]) {
            case VACIO:
                System.out.print(" ");
                break;
            case MINA:
                System.out.print("*");
                break;
            case TESORO:
                System.out.print("$");
                break;
            default:
                break;
        }
        for(y = 3; y >= 0; y--) {
            System.out.print(y + " ");
            for(x = 0; x < 5; x++) {
            switch(juego[x][y]) {
            case VACIO:
            c = " ";
            break;
            case MINA:
            c = "* ";
            break;
            case TESORO:
            c = "€ ";
            break;
            case INTENTO:
            c = "x ";
            break;
            }
            System.out.print(c);
            }
            System.out.println();
            }
            System.out.println(" ----------\n 0 1 2 3 4\n");
            }
            }

