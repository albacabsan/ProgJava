import java.util.Scanner;

public class Digitos {
    public static void main(String[] args) throws Exception {
        System.out.println("Por favor, introduzca un número entero positivo:");
        Scanner s = new Scanner(System.in);
        long numIntroducido = s.nextLong();
        long num=numIntroducido;
        s.close();
        long revés=0;
        int longitud=0;
        int posicion=(int)(Math.random()*longitud)+1;

        while (num>0) {
            num/=10;
            longitud++;
        }

        for (int i=1; i<=posicion; i++) {
            revés= (revés*10) + (num%10);
            num/=10;
            //ir pasando por todos los digitos hasta que llegue a la posicion
        }
        // extrae el dígito de esa posición
        System.out.println((numIntroducido / (long)(Math.pow(10, longitud - posicion))) % 10);
        
    }
}
