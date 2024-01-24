public class MáxParMínImpar {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int num;
        int máximoPar=-100;
        int mínimoImpar=200;
        int suma=0;
        for (int i=1; i<=50; i++) {
            num=(int)(Math.random()*301)-100;
            suma+=num;
            System.out.print(num + " ");
            if (num%2==0) {
                if (num>máximoPar) {
                    máximoPar=num;
                }
            } else {
                if (num<mínimoImpar) {
                    mínimoImpar=num;
                }
            }
        }
        System.out.println();
        System.out.println("El número máximo par es " + máximoPar);
        System.out.println("El número mínimo impar es " + mínimoImpar);
        System.out.println("La media de todos los números generado es " + suma/50);
    }
}
