public class CartaEspañola {
    public static void main(String[] args) throws Exception {
        System.out.println("Carta aleatoria de la baraja francesa: ");
        
        int num=(int)(Math.random()*13)+1;
        if (num==1) {
            System.out.print("As ");
        } else if (num==11) {
            System.out.print("Sota ");
        } else if (num==12) {
            System.out.print("Caballo ");
        } else if (num==13) {
            System.out.print("Rey ");
        } else {
            System.out.print(num + " ");
        }
        System.out.print("de ");
        int palos=(int)(Math.random()*4)+1;
        switch (palos) {
            case 1:
                System.out.println("bastones");
                break;
            case 2:
                System.out.println("copas");
                break;
            case 3:
                System.out.println("monedas");
                break;
            case 4:
                System.out.println("espadas");
                break;
            default:
                break;
        }
    }
}