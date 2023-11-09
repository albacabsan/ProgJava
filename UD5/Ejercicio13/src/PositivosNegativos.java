import java.util.Scanner;

public class PositivosNegativos {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        double num;
        int i;
        int positivo=0;
        int negativo=0;

        System.out.println("Introduce 10 números a continuación:");
        for (i=0; i<10; i++) {
            num = s.nextDouble();
            if (num>=0) {
                positivo++;
            } else {
                negativo++;
            }
        }
        System.out.println("Has introducido " + positivo + " números positivos y " + negativo + " números negativos");
        s.close();
    }
}
