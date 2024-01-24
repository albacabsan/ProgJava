import java.util.Scanner;

public class Serpenteo {
    public static void main(String[] args) throws Exception {
        System.out.print("Introduce la longitud de la serpiente: ");
        Scanner s = new Scanner(System.in);
        int longitud = s.nextInt();
        s.close();
        int num;
        int tope=12;

        for (int cabeza=1; cabeza<=12; cabeza++) {
            System.out.print(" ");
        }
        System.out.println("@");

        for (int j=1; j<longitud;j++) {
            num=(int)(Math.random()*4)+1;
            if (num==1) {
                tope--;
            } else if (num==2) {
                tope++;
            }
            for (int i=1; i<=tope; i++) {
            System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
