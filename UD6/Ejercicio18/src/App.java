public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Colores");
        String color="";
        for (int i=1; i<=3; i++) {
            int num=(int)(Math.random()*5);
            switch (num) {
            case 0:
                color="rojo";
                break;
            case 1:
                color="azul";
                break;
            case 2:
                color="verde";
                break;
            case 3:
                color="amarillo";
                break;
            case 4:
                color="violeta";
                break;
            case 5:
                color="naranja";
                break;
            default:
                break;
        }
        System.out.println(color);
        }
    }
}
