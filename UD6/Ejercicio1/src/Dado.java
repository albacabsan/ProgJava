public class Dado {
    public static void main(String[] args) throws Exception {
        int acum=0;
        System.out.println("Tiradas aleatorias de 3 dados: ");
        for (int i=1; i<=3; i++) {
            int random=(int)(Math.random()*6)+1;
            System.out.print(random + " ");
            acum+=random;
        }
        System.out.println();
        System.out.println("La suma total de estos números es " + acum);
    }
}
