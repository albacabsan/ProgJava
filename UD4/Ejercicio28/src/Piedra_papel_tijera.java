import java.util.Scanner;

public class Piedra_papel_tijera {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String elección1;
        String elección2;

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        elección1 = s.nextLine();
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
        elección2 = s.nextLine();
        if (elección1.equals(elección2)) {
            System.out.print("Empate");
        } else {
            switch (elección1) {
                case "piedra":
                    if (elección2.equals ("papel")) {
                        System.out.print("Gana el jugador 2");
                    } else {
                        System.out.print("Gana el jugador 1");
                    }
                break;
                case "papel":
                    if (elección2.equals ("tijera")) {
                            System.out.print("Gana el jugador 2");
                        } else {
                            System.out.print("Gana el jugador 1");
                        }
                break;
                case "tijera":
                    if (elección2.equals ("piedra")) {
                            System.out.print("Gana el jugador 2");
                        } else {
                            System.out.print("Gana el jugador 1");
                        }
                break;
            default:
                        System.out.println("El valor introducido es incorrecto");
            }

        }

        s.close();
    }
}
