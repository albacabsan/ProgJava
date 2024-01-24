public class Monedas {
    public static void main(String[] args) throws Exception {
        System.out.println("Generador de 5 secuencias de monedas.");
        int num1, num2;
        String moneda="";
        String posición="";
        //establecemos el for con las 5 tiradas
        for (int i=1; i<=5; i++) {
            num1=(int)(Math.random()*7);
            num2=(int)(Math.random()*2);
            switch (num1) {
                case 0:
                    moneda="1 céntimo ";
                    break;
                case 1:
                    moneda="2 céntimos ";
                    break;
                case 2:
                    moneda="5 céntimos ";
                    break;
                case 3:
                    moneda="10 céntimos ";
                    break;
                case 4:
                    moneda="20 céntimos ";
                    break;
                case 5:
                    moneda="50 céntimos ";
                    break;
                case 6:
                    moneda="1 euro ";
                    break;
                case 7:
                    moneda="2 euros ";
                    break;
                default:
                    break;
            }
            switch (num2) {
                case 0:
                    posición=" cara";
                    break;
                case 1:
                    posición=" cruz";
                    break;
                default:
                    break;
            }
            System.out.println(moneda + "-" + posición);
        }
        }
    }
