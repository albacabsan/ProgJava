import java.util.Scanner;

public class Primos {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int num;
        int i=1;
        System.out.print("Introduce un número y te diré si es o no primo: ");
        num= s.nextInt();
        do{
            i+=1;
        } while (num%i!=0);
        if (num/i==1) {
            System.out.println("El número " + num + " es primo");
        } else {
            System.out.println("El número " + num + " no es primo");
        }
        s.close();
    }
}
