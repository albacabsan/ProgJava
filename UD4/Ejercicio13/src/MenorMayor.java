import java.util.Scanner;

public class MenorMayor {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola usuario, dime tres números");
        Scanner s = new Scanner(System.in);

        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        if ((num1>num2) && (num2>num3)) {
            System.out.println("El orden de los números de menor a mayor es " + num3 + ", " + num2 + " y " + num1);
        } else if ((num1>num3) && (num3>num2)){
            System.out.println("El orden de los números de menor a mayor es " + num2 + ", " + num3 + " y " + num1);
        } else if ((num2>num1) && (num1>num3)){
            System.out.println("El orden de los números de menor a mayor es " + num3 + ", " + num1 + " y " + num2);
        } else if ((num2>num3) && (num3>num1)){
            System.out.println("El orden de los números de menor a mayor es " + num1 + ", " + num3 + " y " + num2);
        } else if ((num3>num1) && (num1>num2)){
            System.out.println("El orden de los números de menor a mayor es " + num2 + ", " + num1 + " y " + num3);
        } else if ((num3>num2) && (num2>num1)){
            System.out.println("El orden de los números de menor a mayor es " + num1 + ", " + num2 + " y " + num3);
        }
        s.close();
    }
}
