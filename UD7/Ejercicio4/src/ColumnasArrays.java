public class ColumnasArrays {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] numero= new int[20];
        int[] cuadrado= new int[20];
        int[] cubo= new int[20];
        for (int i=0; i<20; i++) {
            numero[i]=(int)(Math.random()*101);
        }
        for (int i=0; i<20; i++) {
            cuadrado[i]=numero[i]*numero[i];
        }
        for (int i=0; i<20; i++) {
            cubo[i]=numero[i]*numero[i]*numero[i];
        }
        for (int i=0; i<10; i++) {
            System.out.print(numero[i]);
            System.out.print("     ");
            System.out.print(cuadrado[i]);
            System.out.print("     ");
            System.out.print(cubo[i]);
            System.out.println();
        }
    }
}
