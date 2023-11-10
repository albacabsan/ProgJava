import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca dos números distintos: ");
        int num1= s.nextInt();
        int num2= s.nextInt();
        int menor=0;
        int mayor=0;
        int i;
        s.close();

        if (num1>num2) {
            menor = num2;
            mayor = num1;
        } else {
            menor = num1;
            mayor = num2;
        }
        
        if (num1==num2) {
            System.out.println("Los números introducidos no pueden ser iguales");
        } else{
            for (i=menor; i<=mayor; i+=7) {
            System.out.print(i + " ");
        }
        }
    }
}
