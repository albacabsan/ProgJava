import java.util.Scanner;
public class PideNúmeroSecreto {
    public static void main(String[] args) throws Exception {
        System.out.println("Con 5 oportunidades voy a adivinar tu número pensado entre 0 y 100.");
        Scanner s = new Scanner(System.in);
        int num;
        int respuesta;
        int oportunidades=5;
        //establecemos el for con las 5 oportunidades
        for (int i=oportunidades-1; i>=0; i--){
            num=(int)(Math.random()*100);
            System.out.println("Pulsa 1-> si " + num + " es el número secreto");
            System.out.println("Pulsa 2-> si " + num + " es mayor que el número secreto");
            System.out.println("Pulsa 3-> si " + num + " es menor que el número secreto");
            respuesta=s.nextInt();
            //if para saber si acierta o es mayor/menor
            if (respuesta==1) {
                System.out.println("¡Has acertado!");
                i=0;
            } else if (respuesta==2) {
                System.out.println("¡Has fallado! El número secreto es menor");
                System.out.println("Te quedan " + i + " oportunidades");
            } else if (respuesta==3) {
                System.out.println("¡Has fallado! El número secreto es mayor");
                System.out.println("Te quedan " + i + " oportunidades");
            }
        }
        s.close();
    }
}
