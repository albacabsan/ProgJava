public class Tres_O_Mas {

  public static void main(String[] args) throws Exception {
    System.out.println("TRES O MÁS");
    //creamos el array para saber que salen en las tiradas
    int[] dados = new int[5];
    //creamos otro array para ir anotando las repeticiones de números
    int[] repeticiones = new int[6];
    int i = 0;
    int rondas;
    int puntos1 = 0;
    int puntos2 = 0;
    int máximo = 0;

    //JUGADOR 1
    System.out.println("JUGADOR 1");
    //for para realizar 10 rondas de cada jugador
    for (rondas = 1; rondas <= 10; rondas++) {
      System.out.println("Tirada " + rondas + " del jugador 1:");
      //for para recorrer las 5 tiradas de dado por cada ronda
      for (i = 0; i < 5; i++) {
        //obtenemos números random del 1 al 6
        dados[i] = (int) (Math.random() * 6) + 1;
        // segun el nº aleatorio obtenido, sumamos repeticiones en el otro array
        switch (dados[i]) {
          case 1:
            repeticiones[0] += 1;
            break;
          case 2:
            repeticiones[1] += 1;
            break;
          case 3:
            repeticiones[2] += 1;
            break;
          case 4:
            repeticiones[3] += 1;
            break;
          case 5:
            repeticiones[4] += 1;
            break;
          case 6:
            repeticiones[5] += 1;
            break;
          default:
            break;
        }
        System.out.print(dados[i] + "-");
      }
      // averiguamos el máximo número de repetición
      for (int n = 0; n < 6; n++) {
        if (repeticiones[n] > máximo) {
          máximo = repeticiones[n];
        }
      }
      //según el nº máximo de repeteciones, el jugador sumará x puntos
      if (máximo == 3) {
        System.out.println(" ;3 puntos");
        puntos1 += 3;
      } else if (máximo == 4) {
        System.out.println(" ;6 puntos");
        puntos1 += 6;
      } else if (máximo == 5) {
        System.out.println(" ;12 puntos");
        puntos1 += 12;
      } else if (máximo == 2) {
        System.out.println(" ;0 puntos; Tirada extra");
        rondas--;
      } else {
        System.out.println(" ;0 puntos;");
      }
      System.out.println();
      // volvemos a inicializar todo a 0
      máximo = 0;
      for (int x = 0; x < 6; x++) {
        repeticiones[x] = 0;
      }
    }
    // se imprime el recuento de puntos de cada jugador
    System.out.println("El total de puntos del JUGADOR 1 es " + puntos1);
    System.out.println();

    //JUGADOR 2
    System.out.println("JUGADOR 2");
    // for para realizar 10 rondas de cada jugador
    for (rondas = 1; rondas <= 10; rondas++) {
      System.out.println("Tirada " + rondas + " del jugador 2:");
      //for para recorrer las 5 tiradas de dado por cada ronda
      for (i = 0; i < 5; i++) {
        //obtenemos un número random del 1 al 6
        dados[i] = (int) (Math.random() * 6) + 1;
        // segun el nº aleatorio obtenido, sumamos repeticiones en el otro array
        switch (dados[i]) {
          case 1:
            repeticiones[0] += 1;
            break;
          case 2:
            repeticiones[1] += 1;
            break;
          case 3:
            repeticiones[2] += 1;
            break;
          case 4:
            repeticiones[3] += 1;
            break;
          case 5:
            repeticiones[4] += 1;
            break;
          case 6:
            repeticiones[5] += 1;
            break;
          default:
            break;
        }
        System.out.print(dados[i] + "-");
      }
      // averiguamos el máximo número de repetición
      for (int n = 0; n < 6; n++) {
        if (repeticiones[n] > máximo) {
          máximo = repeticiones[n];
        }
      }
      //según el nº máximo de repeteciones, el jugador sumará x puntos
      if (máximo == 3) {
        System.out.println(" ;3 puntos");
        puntos2 += 3;
      } else if (máximo == 4) {
        System.out.println(" ;6 puntos");
        puntos2 += 6;
      } else if (máximo == 5) {
        System.out.println(" ;12 puntos");
        puntos2 += 12;
      } else if (máximo == 2) {
        System.out.println(" ;0 puntos; Tirada extra");
        rondas--;
      } else {
        System.out.println(" ;0 puntos;");
      }
      System.out.println();
      // volvemos a inicializar todo a 0
      máximo = 0;
      for (int x = 0; x < 6; x++) {
        repeticiones[x] = 0;
      }
    }
    // se imprime el recuento de puntos de cada jugador
    System.out.println("El total de puntos del JUGADOR 2 es " + puntos2);
    System.out.println();
    // segun los puntos obtenidos, damos el resultado
    if (puntos1 > puntos2) {
      System.out.println("Ha ganado el jugador 1");
    } else if (puntos2 > puntos1) {
      System.out.println("Ha ganado el jugador 2");
    } else {
      System.out.println("EMPATE");
    }
  }
}
