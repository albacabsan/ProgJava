import java.util.Scanner;
public class NúmeroSecreto {
    public static void main(String[] args) throws Exception {
        System.out.println("Tienes 5 oportunidades para adivinar un número aleatorio entre 0 y 100.");
        int num=(int)(Math.random()*100);
        System.out.println(num);
        Scanner s = new Scanner(System.in);
        int num_usuario;
        int oportunidades=5;
        //establecemos el for con las 5 oportunidades
        for (int i=oportunidades-1; i>=0; i--){
            System.out.print("Introduce un número: ");
            num_usuario = s.nextInt();
            //if para saber si acierta o no
            if (num_usuario!=num) {
                //if para saber si el número introducido es menor o mayor que el secreto.
                if (num_usuario<num) {
                    System.out.println("Has fallado. El número secreto es mayor. Te quedan " + i + " oportunidades");
                } else {
                    System.out.println("Has fallado. El número secreto es menor. Te quedan " + i + " oportunidades");
                }
            } else {
                System.out.println("Enhorabuena. Has acertado");
                i=0;
            }
        }
        s.close();
    }
}
