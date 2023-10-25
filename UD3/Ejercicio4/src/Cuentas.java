import java.util.Scanner;
public class Cuentas {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.print("Por favor, introduce un número: ");
        double num1= s.nextDouble();
        System.out.print("Por favor, introduce otro número: ");
        double num2= s.nextDouble();
        
        double suma= num1+num2;
        double resta= num1-num2;
        double mult=num1*num2;
        double div=num1/num2;
        
        System.out.println(num1+ " + " + num2+ " = "+ suma);
        System.out.println(num1+ " - " + num2+ " = "+ resta);
        System.out.println(num1+ " * " + num2+ " = "+ mult);
        System.out.println(num1+ " / " + num2+ " = "+ div);
        s.close();
    }
}
