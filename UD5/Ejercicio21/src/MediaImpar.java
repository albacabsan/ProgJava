import java.util.Scanner;

public class MediaImpar {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime números positivos: ");
        int num=0;
        int suma=0;
        double media;
        int impar=0;
        int máximo=0;
        int i=0;
        
        while (num>=0) {
            num = s.nextInt();
            i++;
            if (num>0) {
                if ((num%2)==1) {
                    suma+=num;
                    impar++;
                } else {
                    if (num>máximo)  {
                        máximo=num;
                    }
                }
            }
        }
        media = suma/(impar);
        System.out.println("Se han introducido " + i + " números");
        System.out.println("La media de los números impares introducidos es " + media);
        System.out.println("El máximo de los pares es " + máximo);
        s.close();
    }
}
