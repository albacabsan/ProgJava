import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Dime un número y te diré su tabla de multiplicar: ");
        int num = s.nextInt();
        int i;
        int tabla;

        for (i=0; i<=10; i++) {
            tabla=num*i;
            System.out.println(num + " x " + i + " = " + tabla);
        }
        s.close();
    }
}
