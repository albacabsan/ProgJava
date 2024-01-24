public class TokiPakala {

  public static void main(String[] args) throws Exception {
    System.out.println("Toki Pakala (Lengua Estropeada)");
    // declaro todas las variables e inicializo las necesarias
    int vocal_sola_num;
    String vocal_sola_letra = "";
    int vocal_seguida_num;
    String vocal_seguida_letra = "";
    int consonante_num;
    String consonante_letra = "";

    // con un random, generamos la longitud del documento
    int longitud_documento = (int) (Math.random() * 21) + 1;

    // for para que imprima tantos párrafos como se ha marcado en la longitud del documento
    for (int s = 1; s <= longitud_documento; s++) {
      int longitud_parrafo = (int) (Math.random() * 12) + 1; // con un random, se genera la longitud de cada párrafo
      for (int n = 1; n <= longitud_parrafo; n++) { // for para que imprima tantas frases como se ha marcado en la longitud de cada párrafo
        int longitud_frase = (int) (Math.random() * 53); // con un random, se genera la longitud de cada frase
        for (int j = 0; j <= longitud_frase; j++) { // for para que imprima tantas palabras como se ha marcado en la longitud de cada frase
          int longitud_palabra = (int) (Math.random() * 6); // con un random, se genera la longitud de cada palabra
          for (int i = 0; i <= longitud_palabra; i++) { // for para que imprima tantas silabas como se ha marcado en la longitud de cada palabra
            int tipo_silaba = (int) (Math.random() * 8); // con un random, se genera el tipo de sílaba
            if (tipo_silaba == 0) { //si el tipo de sílaba es 0, la sílaba será una sola vocal
              vocal_sola_num = (int) (Math.random() * 5); // con un random, se genera la vocal de cada sílaba
              switch (vocal_sola_num) { //switch para asignar cada valor del random a una vocal
                case 0:
                  vocal_sola_letra = "a";
                  break;
                case 1:
                  vocal_sola_letra = "e";
                  break;
                case 2:
                  vocal_sola_letra = "i";
                  break;
                case 3:
                  vocal_sola_letra = "o";
                  break;
                case 4:
                  vocal_sola_letra = "u";
                  break;
                default:
                  break;
              }
              System.out.print(vocal_sola_letra); // se imprime cada sílaba
            } else { //si el tipo de sílaba es mayor que 0, la sílaba será una sola vocal
              vocal_seguida_num = (int) (Math.random() * 5); // con un random, se genera la vocal y consonante de cada sílaba
              consonante_num = (int) (Math.random() * 9);
              switch (vocal_seguida_num) { //switch para asignar cada valor del random a una vocal
                case 0:
                  vocal_seguida_letra = "a";
                  break;
                case 1:
                  vocal_seguida_letra = "e";
                  break;
                case 2:
                  vocal_seguida_letra = "i";
                  break;
                case 3:
                  vocal_seguida_letra = "o";
                  break;
                case 4:
                  vocal_seguida_letra = "u";
                  break;
                default:
                  break;
              }
              switch (consonante_num) { //switch para asignar cada valor del random a una consonante
                case 0:
                  consonante_letra = "p";
                  break;
                case 1:
                  consonante_letra = "t";
                  break;
                case 2:
                  consonante_letra = "k";
                  break;
                case 3:
                  consonante_letra = "s";
                  break;
                case 4:
                  consonante_letra = "m";
                  break;
                case 5:
                  consonante_letra = "n";
                  break;
                case 6:
                  consonante_letra = "l";
                  break;
                case 7:
                  consonante_letra = "j";
                  break;
                case 8:
                  consonante_letra = "w";
                  break;
                default:
                  break;
              }
              System.out.print(consonante_letra + vocal_seguida_letra); // se imprime cada sílaba
            }
          } // fin bucle palabra
          if (j != longitud_frase) { // se imprime espacio entre sílabas, a menos que sea la última sílaba, entonces se escribe punto
            System.out.print(" ");
          } else {
            System.out.print(".");
            System.out.print(" ");
          }
        } //fin bucle frase
      } //fin bucle párrafo
      System.out.println(); // se imprime un salto de línea para "terminar" la última línea de cada párrafo
      System.out.println(); // se imprime dos saltos de línea después de cada párrafo
      System.out.println();
    } //fin bucle documento
  }
}
