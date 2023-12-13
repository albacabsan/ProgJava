public class App {
public static void main(String[] args) throws Exception {
    System.out.println("Diez líneas de caracteres aleatorios.");
    //inicializamos las variables que vamos a utilizar.
    int num;
    String nota="";
    int longitud;
    longitud=(int)(Math.random()*29+4);
    System.out.println(longitud);
    // for para que pinte 10 líneas
    for (int i=4; i<=longitud; i+=4){
        for (int j=1; j<=4; j++) {
            //generamos un el número de caracter aleatorio y la longitud
            num=(int)(Math.random()*7);
            //switch para asignarle una nota a los números del 1 al 7
            switch (num) {
            case 0:
            nota="do ";
                break;
            case 1:
                nota="re ";
                break;
            case 2:
                nota="mi ";
                break;
            case 3:
                nota="fa ";
                break;
            case 4:
                nota="sol ";
                break;
            case 5:
                nota="la ";
                break;
            case 6:
                nota="si ";
                break;
            default:
                break;
            }
            System.out.print(nota);
        }
        System.out.print("| ");
        }
    }
}