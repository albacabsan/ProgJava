public class Tragaperras {
    public static void main(String[] args) throws Exception {
        System.out.println("Simulador de máquina tragaperras.");
        int num1, num2,num3;
        String figura="";
        //establecemos el for con las 5 oportunidades
            num1=(int)(Math.random()*4);
            num2=(int)(Math.random()*4);
            num3=(int)(Math.random()*4);
            switch (num1) {
                case 0:
                    figura="corazón ";
                    break;
                case 1:
                    figura="diamante ";
                    break;
                case 2:
                    figura="herradura ";
                    break;
                case 3:
                    figura="campana ";
                    break;
                case 4:
                    figura="limón ";
                    break;
                default:
                    break;
            }
            System.out.print(figura);
            switch (num2) {
                case 0:
                    figura="corazón ";
                    break;
                case 1:
                    figura="diamante ";
                    break;
                case 2:
                    figura="herradura ";
                    break;
                case 3:
                    figura="campana ";
                    break;
                case 4:
                    figura="limón ";
                    break;
                default:
                    break;
            }
            System.out.print(figura);
            switch (num3) {
                case 0:
                    figura="corazón ";
                    break;
                case 1:
                    figura="diamante ";
                    break;
                case 2:
                    figura="herradura ";
                    break;
                case 3:
                    figura="campana ";
                    break;
                case 4:
                    figura="limón ";
                    break;
                default:
                    break;
            }
            System.out.print(figura);
            System.out.println();
            //if para saber si acierta o es mayor/menor
            if (num1==num2 && num1==num3) {
                System.out.println("¡Enhorabuena, ha ganado 10 monedas!");
            } else if (num1==num2 || num1==num3 || num2==num3) {
                System.out.println("¡Bien! Ha recuperado su moneda");
            } else {
                System.out.println("¡Lo siento! Ha perdido");
            }
        }
    }
