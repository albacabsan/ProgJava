import java.util.Scanner;

public class CubaAgua {
    public static void main(String[] args) throws Exception {
        System.out.println("cuba de agua");
        Scanner s = new Scanner(System.in);
        //pedimos la capacidad de la cuba
        int capacidad=s.nextInt();
        s.close();
        //generamos aleatoriamente los litros de agua
        int litros;
        litros=(int)(Math.random()*(capacidad+1));
        //for para imprimir tantas líneas como capacidad se ha establecido
        for (int i=1; i<=capacidad; i++) {
            //for para imprimir en cada línea el ancho establecido(6)
            for (int ancho=1; ancho<=6; ancho++) {
                //if para que imprima asteriscos en los laterales
                if (ancho==1 || ancho==6) {
                    System.out.print("* ");
                } else if (i<=capacidad-litros) { //para imprimir espacios en las primeras líneas hasta llegar a litros
                    System.out.print("  ");
                } else {
                    System.out.print("= "); //para imprimir = en tantas líneas como litros se han establecido
                }
            }
            System.out.println();
        }
        //for para imprimir la última línea entera
        for (int ancho=1; ancho<=6; ancho++) {
            System.out.print("* ");
        }
        
    }
}
