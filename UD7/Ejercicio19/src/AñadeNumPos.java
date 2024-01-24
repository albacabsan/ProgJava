import java.util.Scanner;

public class AñadeNumPos {
    public static void main(String[] args) throws Exception {
        int[] num= new int[12];
        int i;
        System.out.print("Índice");
        for (i=0; i<12; i++) {
            System.out.printf("%4d ", i);
        }
        System.out.print("\nValor ");
        for (i=0; i<12; i++) {
            num[i]=(int)(Math.random()*201);
            System.out.printf("%4d ",num[i]);
        }
        Scanner s = new Scanner(System.in);
        System.out.println("\n¿Qué número quieres introducir?");
        int extra=s.nextInt();
        System.out.println("\n¿En qué posición lo quieres introducir?");
        int posicion=s.nextInt();
        s.close();
        for (i = 11; i > posicion; i--) {
            num[i] = num[i - 1];
        }
        num[posicion] = extra;

        System.out.print("Índice");
        for (i=0; i<12; i++) {
            System.out.printf("%4d ", i);
        }
        System.out.print("\nValor ");
        for (i=0; i<12; i++) {
            System.out.printf("%4d ", num[i]);
        }
    }
} 