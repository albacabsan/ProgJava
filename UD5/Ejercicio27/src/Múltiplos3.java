import java.util.Scanner;

public class Múltiplos3 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int num= s.nextInt();
        int i;
        s.close();
        
        if (num==1) {
            System.out.println("El número introducido no pueden ser igual a 1");
        } else {
            System.out.println("Estos son los múltiplos de 3 entre el 1 y el " + num + ": ");
            for (i=1; i<=num; i+=3) {
                if (i%3==0) {
                    System.out.print(i + " ");
                } else {
                    i+=2;
                    System.out.print(i + " ");
                }
            }
        }
    }
}
