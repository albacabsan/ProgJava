public class PosMáxMín {
    public static void main(String[] args) throws Exception {
        int[][] num = new int[6][10];
        int i;
        int j=0;
        int máximo=0, mínimo=100;
        int filaMax=0;
        int filaMin=0;
        int columMax=0;
        int columMin=0;
        //introduce los números en el array
        for (i=0; i<6; i++) {
            for (j=0; j<10; j++) {
                num[i][j]=(int)(Math.random()*1001);
                System.out.printf("%7d ",num[i][j]);
                if (num[i][j]>máximo) {
                    máximo=num[i][j];
                    filaMax=i;
                    columMax=j;
                }
                if (num[i][j]<mínimo) {
                    mínimo=num[i][j];
                    filaMin=i;
                    columMin=j;
                }
            }
            System.out.println();
        }
        System.out.println("posicion: ["+ filaMax + ", " + columMax + "] del número: " + máximo);
        System.out.println("posicion: ["+ filaMin + ", " + columMin + "] del número: " + mínimo);
    }
}