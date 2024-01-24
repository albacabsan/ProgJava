import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Introduce dinero para apostar: ");
        Scanner s = new Scanner(System.in);
        int apuesta= s.nextInt();
        s.close();
        int dado1=(int)(Math.random()*6)+1;
        int dado2=(int)(Math.random()*6)+1;
        System.out.println(dado1);
        System.out.println(dado2);
        int suma1=dado1+dado2;
        int dado3;
        int dado4;
        int suma2;
        if (suma1==7 || suma1==11) {
            System.out.println("Ganaste " + apuesta + ". Ahora tienes " + apuesta*2);
        } else if (suma1==2 || suma1==3 || suma1==12) {
            System.out.println("Perdiste todo el dinero");
        } else {
            System.out.println(suma1);
            dado3=(int)(Math.random()*6)+1;
            dado4=(int)(Math.random()*6)+1;
            suma2=dado3+dado4;
            while (suma2!=suma1 || suma2!=7) {
                dado3=(int)(Math.random()*6)+1;
                dado4=(int)(Math.random()*6)+1;
                if ((suma2)==suma1) {
                System.out.println("Ganaste");
                suma2=suma1;
                } else if ((suma2)==7) {
                System.out.println("Perdiste");
                suma2=7;
            }
            }
        }
    }
}
