public class Hola {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola");
        int altura=(int)((Math.random()*6)+1)*2+1;
        System.out.println(altura);
        int ancho=6;
        // primera mitad de las letras
        for (int i=1; i<=altura/2; i++) {
            //PINTA H
            for (int horz=1; horz<=ancho; horz++) {
                if (horz==1 || horz==ancho) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            //PINTA O
            if (i==1) {
                System.out.print(" **** ");
            } else {
                for (int horz=1; horz<=ancho; horz++) {
                    if (horz==1 || horz==ancho) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print(" ");
            //PINTA L
            for (int horz=1; horz<=ancho; horz++) {
                if (horz==1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            //PINTA A
            if (i==1) {
                System.out.print(" **** ");
            } else {
                for (int horz=1; horz<=ancho; horz++) {
                    if (horz==1 || horz==ancho) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        System.out.println();
        }

        //linea central
        for (int p=1; p<=6; p++) {
            System.out.print("*");
        }
        System.out.print(" ");
        for (int p=1; p<=6; p++) {
            if (p==1 ||p==6) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");
        for (int p=1; p<=6; p++) {
            if (p==1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.print(" ");
        for (int p=1; p<=6; p++) {
            System.out.print("*");
        }
        System.out.println();

        //segunda mitad de las letras
        for (int i=1; i<=altura/2; i++) {
            //PINTA H
            for (int horz=1; horz<=ancho; horz++) {
                if (horz==1 || horz==ancho) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            //PINTA O
            if (i==altura/2) {
                System.out.print(" **** ");
            } else {
                for (int horz=1; horz<=ancho; horz++) {
                    if (horz==1 || horz==ancho) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print(" ");
            //PINTA L
            if (i==altura/2) {
                System.out.print("******");
            } else {
                for (int horz=1; horz<=ancho; horz++) {
                    if (horz==1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print(" ");
            //PINTA A
            for (int horz=1; horz<=ancho; horz++) {
                if (horz==1 || horz==ancho) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
    }
}
