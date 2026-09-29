import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica el precio de la compra (con IVA)");

        double precioConIva = lector.nextDouble(); //Precio de la compra que ya incluye el iva (21%) 0 (121%)
        //por consola el decimal es la , y programando del .
        System.out.println("Introduce el IVA aplicado ");
        int iva = lector.nextInt();
        double multiplicadorIva = 1+ iva/100.0; //

        lector.close();
        //cuanto has pagado de iva

        double precioSinIva = precioConIva / multiplicadorIva;
        double importeIva = precioConIva - precioSinIva;
        System.out.println("Calculos de Precio");
        // %f -> decimales %s -> palabras %d -> enteros
        //System.out.printf("Has pagado un total de %.2f de IVA sobre %.2f\n", importeIva, precioConIva);
        //System.out.printf("Has pagado un articulo de %.2f donde el precio real sin iva es de %.2f\n",precioConIva,precioSinIva);
        System.out.printf("Has pagado %.2f € de los cuales desglosandolo han sido %.2f € de precio sin iva y %.2f € de iva, donde el porcentaje de iva aplicado ha sido %d %%\n",precioConIva,precioSinIva,importeIva,iva);
    }
}
