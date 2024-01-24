public class PokerDados {
    public static void main(String[] args) throws Exception {
        System.out.println("Simulador de 5 tiradas de dados de póker.");
        int num;
        String figura="";
        //establecemos el for con las 5 oportunidades
        for (int i=1; i<=5; i++) {
            num=(int)(Math.random()*5);
            switch (num) {
                case 0:
                    figura="As ";
                    break;
                case 1:
                    figura="K ";
                    break;
                case 2:
                    figura="Q ";
                    break;
                case 3:
                    figura="J ";
                    break;
                case 4:
                    figura="7 ";
                    break;
                case 5:
                    figura="8 ";
                    break;
                default:
                    break;
            }
            System.out.print(figura);
        }
        }
    }

