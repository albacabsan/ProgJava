import java.util.Scanner;

public class DiferenciaHoras {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce la primera hora.");
        System.out.print("Día(1-7): ");
        int dia1 = s.nextInt();
        System.out.print("Hora: ");
        int hora1 = s.nextInt();
        System.out.println("Introduce la segunda hora.");
        System.out.print("Día(1-7): ");
        int dia2 = s.nextInt();
        System.out.print("Hora: ");
        int hora2 = s.nextInt();
        int dif_horas=0;
        int dif_dias=0;
        s.close();
        dif_dias=dia2-dia1;
        
        if (dia1==0 || dia2==0 || hora1<0 || hora1>23 || hora2<0 || hora2>23) {
            System.out.println("El dia o la hora son incorrectos");
        }
        if ((dia1==dia2 || dia1<dia2) && (hora1<hora2)) {
            if (dia1==dia2) {
                dif_horas+=hora2-hora1;
            } else {
                if (dif_dias>1) {
                    dif_horas+=hora2;
                    dif_horas+=24-hora1;
                    dif_horas+=(dif_dias-1)*24;
                } else {
                    dif_horas+=hora2;
                    dif_horas+=24-hora1;
                }
            }
            System.out.println("La diferencia de horas es " + dif_horas);
        } else {
            System.out.println("La segunda fecha debe ser posterior");
        }
    }
}
