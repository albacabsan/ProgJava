import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        //Declaramos e inicializamos todas las variables
        int categoría=0;
        String nombre_producto;
        double cant_producto=0;
        double precio_unidad=0;
        int tipo_alimento=0;
        double IVA=0;
        double oferta=0;
        double precioInicial;
        double precioIVA=0;
        double precioTotal_IVA=0;
        double precioConDescuento=0;

        System.out.println("Introduzca el tipo de producto: ");
        System.out.println("1. Alimentación ");
        System.out.println("2. Electrónica ");
        System.out.println("3. Farmacia ");
        System.out.println("4. Moda ");
        categoría = s.nextInt();
        if (categoría==1) {
            System.out.println("Introduzca el tipo de alimento: ");
                System.out.println("1. Huevos ");
                System.out.println("2. Leche ");
                System.out.println("3. Pan ");
                System.out.println("4. Fruta ");
                System.out.println("5. Verdura ");
                System.out.println("6. Otros ");
                tipo_alimento= s.nextInt();
        }
        
        //Pedimos al usuario toda la información de la compra
        System.out.println("Introduzca el nombre del producto: ");
        nombre_producto = s.next();
        System.out.println("Introduzca la cantidad de productos: ");
        cant_producto = s.nextDouble();
        System.out.println("Introduzca el precio por unidad del producto: ");
        precio_unidad = s.nextDouble();
        
        precioInicial=cant_producto*precio_unidad;

        switch (categoría) {
            case 1:
                if (tipo_alimento==2 || tipo_alimento==3 || tipo_alimento==4 || tipo_alimento==5) {
                    IVA=0.04;
                } else {
                    IVA=0.1;
                }
                precioIVA= precioInicial*IVA;
                precioTotal_IVA= precioInicial+precioIVA;
                System.out.println("Factura");
                System.out.println("_____________________________");
                System.out.printf("Artículo %19s\n", nombre_producto);
                System.out.printf("Precio %10.2f EUR/unidad\n",precio_unidad);
                System.out.printf("Cantidad %19.0f \n",cant_producto);
                System.out.printf("Total %18.2f EUR\n",precioInicial);
                System.out.printf("IVA %20.2f EUR\n",precioIVA);
                System.out.println("_____________________________");
                System.out.printf("Total con IVA %10.2f EUR\n",precioTotal_IVA);
                break;
            case 2:
                IVA=0.21;
                oferta=precioInicial*0.2;
                precioConDescuento=precioInicial-oferta;
                precioIVA= precioConDescuento*IVA;
                precioTotal_IVA= precioConDescuento+precioIVA;
                System.out.println("Factura");
                System.out.println("_______________________________________");
                System.out.printf("Artículo %28s\n", nombre_producto);
                System.out.printf("Precio %19.2f EUR/unidad\n",precio_unidad);
                System.out.printf("Cantidad %28.0f \n", cant_producto);
                System.out.printf("Total %27.2f EUR\n",precioInicial);
                System.out.printf("Descuento %23.2f EUR\n",oferta);
                System.out.printf("Total con descuento %13.2f EUR\n",precioConDescuento);
                System.out.printf("IVA %29.2f EUR\n",precioIVA);
                System.out.println("_____________________________________");
                System.out.printf("Total con IVA %19.2f EUR\n",precioTotal_IVA);
                break;
            case 3:
                IVA=0.04;
                precioIVA= precioInicial*IVA;
                precioTotal_IVA=precioInicial+precioIVA;
                System.out.println("Factura");
                System.out.println("_____________________________");
                System.out.printf("Artículo %19s\n", nombre_producto);
                System.out.printf("Precio %10.2f EUR/unidad\n",precio_unidad);
                System.out.printf("Cantidad %19.0f \n", cant_producto);
                System.out.printf("Total %18.2f EUR\n",precioInicial);
                System.out.printf("IVA %20.2f EUR\n",precioIVA);
                System.out.println("_____________________________");
                System.out.printf("Total con IVA %10.2f EUR\n",precioTotal_IVA);
                break;
            case 4:
                IVA=0.21;
                precioIVA= precioInicial*IVA;
                oferta=(cant_producto-((cant_producto - cant_producto/3)))*precio_unidad;
                precioConDescuento=precio_unidad+oferta;
                precioTotal_IVA= precioConDescuento+precioIVA;
                System.out.println("Factura");
                System.out.println("_______________________________________");
                System.out.printf("Artículo %28s\n", nombre_producto);
                System.out.printf("Precio %19.2f EUR/unidad\n",precio_unidad);
                System.out.printf("Cantidad %28.0f \n", cant_producto);
                System.out.printf("Total %27.2f EUR\n",precioInicial);
                System.out.printf("Descuento %23.2f EUR\n",oferta);
                System.out.printf("Total con descuento %13.2f EUR\n",precioConDescuento);
                System.out.printf("IVA %29.2f EUR\n",precioIVA);
                System.out.println("_____________________________________");
                System.out.printf("Total con IVA %19.2f EUR\n",precioTotal_IVA);
                break;
            default:
                System.out.println("Elección errónea");
                break;
        }
        s.close();
    }
}
