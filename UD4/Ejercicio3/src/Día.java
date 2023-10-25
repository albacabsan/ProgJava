import java.util.Scanner;

public class Día {

    public static void main(String[] args) throws Exception {
      Scanner s = new Scanner(System.in);
      System.out.println(
        "Dime un número del 1 al 7 y te digo que día de la semana es: "
      );
      int día = s.nextInt();
      switch (día) {
        case 1:
        System.out.print("Lunes");
          break;
        case 2:
          System.out.print("Martes");
          break;
        case 3:
          System.out.print("Miércoles");
          break;
        case 4:
          System.out.print("Jueves");
          break;
        case 5:
          System.out.print("Viernes");
          break;
        case 6:
          System.out.print("Sábado");
          break;
        case 7:
          System.out.print("Domingo");
          break;
        default:
          System.out.print("Ese día no es válido");
      }
      s.close();
    }
  }
