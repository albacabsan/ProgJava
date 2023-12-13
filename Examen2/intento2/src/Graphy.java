import java.util.Scanner;

public class Graphy {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    int filas, lineas, ast;
    int longitud = 1;

    // pedimos el número al usuario
    System.out.print("Introduce un número: ");
    long num = s.nextInt();
    long num_original = num;
    long num1 = num_original;
    long num2 = num_original;
    int i = 1;
    s.close();

    //convertimos el numero inicial en cadena para que sea más facil imprimirlo línea a línea
    String num_separado = Long.toString(num);

    //averiguamos la longitud del número
    while (num1 > 10) {
      num1 /= 10;
      longitud++;
    }

    //averiguamos cual es el mayor dígito
    long digitoMayor = 0;
    while (num2 > 0) {
      long digito_actual = num2 % 10;
      if (digito_actual > digitoMayor) {
        digitoMayor = digito_actual;
      }
      num2 /= 10;
    }

    //nos aseguramos de que el número sea mayor que 0
    if (num_original <= 0) {
      System.out.println("Error de número. El número debe ser mayor que 0.");
    } else {
      System.out.print("\u2554");
      //para que imprima tantas filas como longitud del número
      for (i = 0; i < longitud; i++) {
        char dig = num_separado.charAt(i);
        System.out.print("\u2560");
        // for para imprimir las lineas horizontales
        for (lineas = 0; lineas <= digitoMayor; lineas++) {
          System.out.print("\u2550");
          System.out.print("\u2566");
        }
        System.out.println();
        // imprimimos la primera linea vertical y el digito
        System.out.print("\u2551");
        System.out.print(dig);
        // for para imprimir el resto de lineas verticales y asteriscos
        for (filas = 0; filas < digitoMayor; filas++) {
          System.out.print("\u2551");
          for (ast = 1; ast <= digitoMayor; ast++) {
            System.out.print("*\u2551");
            filas++;
          }
          filas++;
        }
        System.out.println();
      }
      System.out.print("\u255A");
      // for para imprimir la última línea horizontal
      for (lineas = 0; lineas <= digitoMayor; lineas++) {
        System.out.print("\u2550");
        System.out.print("\u2569");
      }
    }
  }
}
