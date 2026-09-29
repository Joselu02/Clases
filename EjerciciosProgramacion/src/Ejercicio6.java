import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica el precio de la compra (con IVA)");
        double precioCompra = lector.nextDouble(); //por consola el decimal es la , y programando del .
        System.out.println("Introduce el IVA");
        double iva = 1+lector.nextInt()/100.0;
        lector.close();
        //cuanto has pagado de iva
        double precioSinIva = precioCompra / iva;
        double precioIva = precioCompra - precioSinIva;
        System.out.println("Calculos de Precio");
        // %f -> decimales %s -> palabras %d -> enteros
        System.out.printf("Has pagado un total de %.2f de IVA sobre %.2f\n", precioIva, precioCompra);
        System.out.printf("Has pagado un articulo de %.2f donde el precio real sin iva es de %.2f\n",precioCompra,precioSinIva);

    }
}
