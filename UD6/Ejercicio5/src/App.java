public class App {
    public static void main(String[] args) throws Exception {
        int acum=0;
        System.out.println("50 números aleatorios entre 100 y 199: ");
        //imprime los 50 números aleatorios
        for (int i=1; i<=50; i++) {
            int random=(int)(Math.random()*100+100);
            System.out.print(random + " ");
            acum+=random;
        }
        //se hace la media de todos los números
        int media = acum/50;
        //se busca el mínimo y el máximo
        System.out.println();
        System.out.println("El máximo es , el mínimo es y la media es " + media);
    }
}
if (maximo<num) {
    num=maximo
}
