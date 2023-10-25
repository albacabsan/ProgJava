/*
 * Imprime por pantalla: ¡Hola mundo!
 */

public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("\033[31mHello, World!");
    System.out.println(ConsoleColors.PURPLE + "Writing in purple color");
    System.out.println(ConsoleColors.GREEN_BOLD + "Writing in green bold color");
    System.out.print(ConsoleColors.RESET);
  }
}
