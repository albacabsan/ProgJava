public class CartaFrancesa {
    public static void main(String[] args) throws Exception {
        System.out.println("Carta aleatoria de la baraja francesa: ");
        
        int num=(int)(Math.random()*13)+1;
        if (num==1) {
            System.out.print("A ");
        } else if (num==11) {
            System.out.print("J ");
        } else if (num==12) {
            System.out.print("Q ");
        } else if (num==13) {
            System.out.print("K ");
        } else {
            System.out.print(num + " ");
        }
        System.out.print("de ");
        int palos=(int)(Math.random()*4)+1;
        switch (palos) {
            case 1:
                System.out.println("picas");
                break;
            case 2:
                System.out.println("corazones");
                break;
            case 3:
                System.out.println("diamantes");
                break;
            case 4:
                System.out.println("tréboles");
                break;
            default:
                break;
        }
    }
}

