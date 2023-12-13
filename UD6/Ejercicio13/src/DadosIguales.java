public class DadosIguales {
    public static void main(String[] args) throws Exception {
        System.out.println("Tiradas de 2 dados");
        int dado1;
        int dado2;
        do {
            dado1=(int)(Math.random()*6)+1;
            dado2=(int)(Math.random()*6)+1;
            System.out.println(dado1 + " " + dado2);
        } while (dado1!=dado2);
        System.out.println("Ambos dados son iguales a " + dado1);
    }
}
