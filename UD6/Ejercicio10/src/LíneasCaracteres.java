public class LíneasCaracteres {
    public static void main(String[] args) throws Exception {
        System.out.println("Diez líneas de caracteres aleatorios.");
        //inicializamos las variables que vamos a utilizar.
        int longitud;
        int num;
        String linea="";
        // for para que pinte 10 líneas
        for (int i=1; i<=10; i++){
            //generamos un el número de caracter aleatorio y la longitud
            num=(int)(Math.random()*6);
            longitud=(int)(Math.random()*40+1);
            //switch para asignarle un caracter a los números del 1 al 6
            switch (num) {
            case 0:
                linea="* ";
                break;
            case 1:
                linea="- ";
                break;
            case 2:
                linea="= ";
                break;
            case 3:
                linea=". ";
                break;
            case 4:
                linea="| ";
                break;
            case 5:
                linea="@ ";
                break;
            default:
                break;
            }
            //for para que imprima tantos caracteres como sea la longitud generada
            for (int j=1; j<=longitud; j++) {
                System.out.print(linea);
            }
            //salto de línea
            System.out.println();
        }
    }
}
