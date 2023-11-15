import java.util.Scanner;

public class NúmeroRevés {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Dime un número y le daré la vuelta: ");
        int num = s.nextInt();
        int revés=0;
        int inicial = num;

        while (num>0) {
            revés= (revés*10) + (num%10);
            num/=10;
        }
        System.out.println("El número inicial es " + inicial + " y del revés es " + revés);
        s.close();
    }
}
