public class AleatoriosTabla {
    public static void main(String[] args) throws Exception {
        int[][] num = new int[4][5];
        int i;
        int j=0;
        //introduce los números en el array
        for (i=0; i<4; i++) {
            for (j=0; j<5; j++) {
                num[i][j]=(int)(Math.random()*900)+100;
            }
        }
        
        int sumaColum=0;
        int sumaFila=0;
        //muestra datos y suma de filas
        for (i=0; i<4; i++) {
            sumaFila=0;
            for (j=0; j<5; j++) {
                System.out.printf("%7d ",num[i][j]);
                sumaFila+=num[i][j];
            }
            System.out.printf("|%7d\n", sumaFila);
        }
        // muestra suma de columnas
        for(j = 0; j < 5; j++) {
            System.out.print("----------");
        }
        System.out.println("-----------");
        
        int sumaTotal=0;

        for (j=0; j<5; j++) {
            sumaColum=0;
            for (i=0; i<4; i++) {
                sumaColum+=num[i][j];
            }
            sumaTotal+=sumaColum;
            System.out.printf("%8d", sumaColum);
        }
        System.out.printf("%9d", sumaTotal);
    }
}
