public class Notas {
    public static void main(String[] args) throws Exception {
        System.out.println("Diez líneas de caracteres aleatorios.");
        //inicializamos las variables que vamos a utilizar.
        int num;
        int suspensos=0;
        int sufis=0;
        int bien=0;
        int notable=0;
        int sobre=0;
        String nota="";
        // for para que pinte 20 notas
        for (int i=1; i<=20; i++){
            //generamos el número de nota aleatoria
            num=(int)(Math.random()*5);
            //switch para asignarle una nota a los números del 1 al 5
            switch (num) {
            case 0:
                nota="Suspenso";
                break;
            case 1:
                nota="Suficiente ";
                break;
            case 2:
                nota="Bien ";
                break;
            case 3:
                nota="Notable ";
                break;
            case 4:
                nota="Sobresaliente";
                break;
            default:
                break;
            }
            //if par ir contando cuantas notas hay de cada
            if (num==0) {
                suspensos++;
            } else if (num==1) {
                sufis++;
            } else if (num==2) {
                bien++;
            } else if (num==3) {
                notable++;
            } else if (num==4) {
                sobre++;
            }
            System.out.println(nota);
        }
        //imprime el total de notas
        System.out.println("El total de suspensos es " + suspensos);
        System.out.println("El total de suficientes es " + sufis);
        System.out.println("El total de bienes es " + bien);
        System.out.println("El total de notables es " + notable);
        System.out.println("El total de sobresalientes es " + sobre);
    }
}