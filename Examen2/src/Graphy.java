import java.util.Scanner;

public class Graphy {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int filas, columnas,i, ast; 
        int longitud=1;
        
        // pedimos el número al usuario
        System.out.print("Introduce un número: ");
        int num = s.nextInt();
        int num_original= num;
        int num1=num_original;
        int num2=num_original;
        s.close();

        //convertimos el numero inicial en cadena para que sea más facil imprimirlo línea a línea
        String num_separado = Integer.toString(num);

        //averiguamos la longitud
        while (num1>10) {
            num1/=10;
            longitud++;
        }

        //averiguamos cual es el mayor numero
        int digitoMayor=0;
        while (num2 > 0) {
            int digito_actual = num2 % 10;
            if (digito_actual > digitoMayor) {
                digitoMayor = digito_actual;
            }
            num2/= 10;
        }


        //nos aseguramos de que el número sea mayor que 0
        if (num_original<=0) {
            System.out.println("Error de número. El número debe ser mayor que 0.");
        } else {
            //para que imprima tantas filas como longitud del número
            for (i=1; i<=longitud+1; i++) {
                for (filas=1; filas<=digitoMayor+1; filas++) {
                System.out.print(" _ ");
                }
                System.out.println();
                //escribir el numero por lineas
                for (columnas=0; columnas<=digitoMayor+1; columnas++) {
                    System.out.print("| ");
                    for (i = 0; i < num_separado.length(); i++) {
                    char dig = num_separado.charAt(i);
                    System.out.println(dig);
                } 
                }
                System.out.println();
            }
        }
    }
}


/*if (columnas==1) {
                        for (ast=1; ast<=i; ast++) {
                            System.out.print("* ");
                            System.out.print("| ");
                        }
                    } */


/* Aquí tienes un código en Java que toma un número introducido por teclado y escribe cada dígito en líneas distintas:

```java
import java.util.Scanner;

public class DigitosEnLineas {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        // Imprimir cada dígito en líneas distintas
        escribirDigitosEnLineas(numero);

        // Cerrar el scanner
        scanner.close();
    }

    // Función para escribir cada dígito en líneas distintas
    private static void escribirDigitosEnLineas(int numero) {
        // Convertir el número a una cadena para facilitar la manipulación
        String numeroStr = Integer.toString(numero);

        // Iterar sobre cada dígito y escribirlo en una línea
        for (int i = 0; i < numeroStr.length(); i++) {
            char digito = numeroStr.charAt(i);
            System.out.println(digito);
        }
    }
}
```

Este programa convierte el número ingresado a una cadena de caracteres y luego itera sobre cada carácter (dígito) para imprimirlo en líneas distintas. */

