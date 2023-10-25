public class Factura {
    public static void main(String[] args) throws Exception {
        int precio= 320;
        double IVA= precio*0.21;
        System.out.println("El total de la factura incluyendo el IVA es " + (precio+IVA));
    }
}
