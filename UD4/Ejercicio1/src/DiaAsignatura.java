public class DiaAsignatura {

  public static void main(String[] args) throws Exception {
    System.out.println(
      "Dime un día de la semana y te digo qué asignatura toca a primera hora ese día: "
    );
    String día;
    día = System.console().readLine();
    switch (día) {
      case "lunes":
      case "martes":
        System.out.print("Sistemas informáticos");
        break;
      case "miércoles":
      case "viernes":
        System.out.print("Bases de datos");
        break;
      case "jueves":
        System.out.print("Lenguaje de marcas");
        break;
      default:
        System.out.print("Ese día no es válido o no hay clase");
    }
  }
}
