import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String comida;
        String bebida;
        String sabor="";
        double precio_comida=0;
        double precio_bebida=0;
        double precio_total;

        System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
        comida = s.nextLine();
        if (comida.equalsIgnoreCase("pitufo")) {
            System.out.print("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");
            sabor = s.nextLine();
        }
        switch (comida) {
            case "palmera":
                System.out.println("Palmera: 1,40 euros");
                precio_comida=1.40;
                break;
            case "donut":
                System.out.println("Donut: 1 euros");
                precio_comida=1;
                break;
            case "pitufo":
                if (sabor=="tortilla") {
                    System.out.println("Pitufo con tortilla: 1,60 euros");
                    precio_comida= 1.60;
                } else {
                    System.out.println("Pitufo con aceite: 1,20 euros");
                    precio_comida= 1.20;
                }
                break;
            default:
                System.out.println("Elección no válida");
                break;
        }
        
        System.out.print("¿Qué ha tomado de beber? (zumo o cafe): ");
        bebida = s.nextLine();
        switch (bebida) {
            case "zumo":
                System.out.println("Zumo: 1,50 euros");
                precio_bebida=1.50;
                break;
            case "cafe":
                System.out.println("Café: 1,20 euros");
                precio_bebida=1.20;
                break;
            default:
                System.out.println("Elección no válida");
                break;
        }
        precio_total = precio_comida+precio_bebida;
        System.out.println("Total desayuno: " + precio_total + " euros");
        s.close();
    }
}
