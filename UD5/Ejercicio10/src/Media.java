import java.util.Scanner;

public class Media {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Dime números positivos y te haré la media: ");
        double num=0;
        double suma=0;
        double media;
        int i=0;
        while (num>=0) {
            num = s.nextDouble();
            if (num>0) {
                suma+=num;
                i++;
            }
        }
        media = suma/(i);
        System.out.println("La media de los números introducidos es " + media);
        s.close();
    }

}
