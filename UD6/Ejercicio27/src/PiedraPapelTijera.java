import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) throws Exception {
        System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
        Scanner s = new Scanner(System.in);
        String usuario = s.nextLine();
        s.close();
        int opc_usuario=0;
        int num=(int)(Math.random()*2);
        String ordenador="";
        switch (num) {
            case 0:
                ordenador="piedra";
                break;
            case 1:
                ordenador="papel";
                break;
            case 2:
                ordenador="tijera";
                break;
            default:
                break;
        }
        System.out.println("Turno del ordenador: " + ordenador);

        switch (usuario) {
                case "piedra":
                    opc_usuario=0;             
                    break;
                case "papel":
                    opc_usuario=1;             
                    break;
                case "tijera":
                    opc_usuario=2;             
                    break;
                default:
                    opc_usuario=3;
                    break;
            }
        if (opc_usuario==num) {
            System.out.println("Empate");
        } else if ((opc_usuario==0 && num==2) || (opc_usuario==2 && num==1) || (opc_usuario==1 && num==0)) {
            System.out.println("Gana el usuario");
        } else if (opc_usuario==3) {
            System.out.println("ERROR");
        } else {
            System.out.println("Gana el ordenador");
        }
    }
}
