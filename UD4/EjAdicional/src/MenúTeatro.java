import java.util.Scanner;

public class MenúTeatro {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    System.out.println("Dime el precio de la entrada general:");
    double precio_general = s.nextDouble();
    System.out.println("Elija un tipo de entrada:");
    System.out.println("1. Palco");
    System.out.println("2. Gallinero");
    int tipo_entrada = s.nextInt();
    if ((tipo_entrada==1) || (tipo_entrada==2)) {
        System.out.println("Elija una de las siguientes opciones:");
        System.out.println("1. Aplicar un descuento (público con invitación)");
        System.out.println("2. Aplicar el precio normal (para público local)");
        System.out.println("3. Aplicar un sobreprecio (para público foráneo)");
        int opc_precio = s.nextInt();
        switch (tipo_entrada) {
        case 1:
        if (opc_precio == 1) {
          System.out.println("El precio de tu entrada al palco será de " + precio_general * 0.9);
        } else if (opc_precio == 3) {
          System.out.println("El precio de tu entrada al palco será de " + precio_general * 1.1);
        } else if (opc_precio == 2) {
          System.out.println("El precio de tu entrada al palco será de " + precio_general);
        } else {
          System.out.println("La opción elegida no es válida");
        }
        break;
        case 2:
        if (opc_precio == 1) {
          System.out.println("El precio de tu entrada al gallinero será de " + precio_general * 0.95);
        } else if (opc_precio == 3) {
          System.out.println("El precio de tu entrada al gallinero será de " + precio_general * 1.05);
        } else if (opc_precio == 2) {
          System.out.println("El precio de tu entrada al gallinero será de " + precio_general);
        } else {
          System.out.println("La opción elegida no es válida");
        }
        break;
    }
    } else {
        System.out.println("La opción elegida no es válida");
    }
    s.close();
  }
}
