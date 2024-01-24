public class ParImpar {
    public static void main(String[] args) throws Exception {
        int[] ArrayInicial= new int[20];
        int[] ArrayPar= new int[20];
        int[] ArrayImpar= new int[20];
        int num, pares=0, impares=0;
        for (int i=0; i<20; i++) {
            num=(int)(Math.random()*101);
            ArrayInicial[i]=num;
            if (num%2==0) {
                ArrayPar[pares++]=num;
            } else {
                ArrayImpar[impares++]=num;
            }
        }
        System.out.println("Array Original:");
        for (int i=0; i<20; i++) {
            System.out.print(ArrayInicial[i]+ " ");
        }
        for (int i=0; i<pares; i++) {
            ArrayInicial[i]=ArrayPar[i];
        }
        for (int i=pares; i<20; i++) {
            ArrayInicial[i]=ArrayImpar[i-pares];
        }
        System.out.println("\nArray con pares delante:");
        for (int i=0; i<20; i++) {
            System.out.print(ArrayInicial[i]+ " ");
        }
    }
}
