import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Dime el día de tu cumpleaños: ");
        int dia = s.nextInt();
        System.out.print("Dime el mes de tu cumpleaños(1-12): ");
        int mes = s.nextInt();

        if (((mes==12) && (dia>21 && dia<=31)) || ((mes==1) && (dia>=1 && dia<20))) {
            System.out.println("Tu horóscopo es Capricornio");
        }
        if (((mes==1) && (dia>19 && dia<=31)) || ((mes==2) && (dia>=1 && dia<19))) {
            System.out.println("Tu horóscopo es Acuario");
        }
        if (((mes==2) && (dia>18 && dia<=29)) || ((mes==3) && (dia>=1 && dia<21))) {
            System.out.println("Tu horóscopo es Piscis");
        }
        if (((mes==3) && (dia>20 && dia<=31)) || ((mes==4) && (dia>=1 && dia<20))) {
            System.out.println("Tu horóscopo es Aries");
        }
        if (((mes==4) && (dia>19 && dia<=31)) || ((mes==5) && (dia>=1 && dia<21))) {
            System.out.println("Tu horóscopo es Tauro");
        }
        if (((mes==5) && (dia>20 && dia<=31)) || ((mes==6) && (dia>=1 && dia<21))) {
            System.out.println("Tu horóscopo es Géminis");
        }
        if (((mes==6) && (dia>20 && dia<=31)) || ((mes==7) && (dia>=1 && dia<23))) {
            System.out.println("Tu horóscopo es Cáncer");
        }
        if (((mes==7) && (dia>22 && dia<=31)) || ((mes==8) && (dia>=1 && dia<23))) {
            System.out.println("Tu horóscopo es Leo");
        }
        if (((mes==8) && (dia>22 && dia<=31)) || ((mes==9) && (dia>=1 && dia<23))) {
            System.out.println("Tu horóscopo es Virgo");
        }
        if (((mes==9) && (dia>22 && dia<=31)) || ((mes==10) && (dia>=1 && dia<23))) {
            System.out.println("Tu horóscopo es Libra");
        }
        if (((mes==10) && (dia>22 && dia<=31)) || ((mes==11) && (dia>=1 && dia<22))) {
            System.out.println("Tu horóscopo es Escorpio");
        }
        if (((mes==11) && (dia>21 && dia<=31)) || ((mes==12) && (dia>=1 && dia<22))) {
            System.out.println("Tu horóscopo es Sagitario");
        }
        if (((dia<1) || (dia>31)) || ((mes<1) || (mes>12))) {
            System.out.println("La fecha introducida es incorrecta");
        }
        s.close();
    }
}