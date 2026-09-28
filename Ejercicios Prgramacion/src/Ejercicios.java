//Ejercicio 6

import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Valor de la compra (entre 0.00 y 500.00):");
        double total = teclado.nextDouble();

        System.out.print("IVA (entre 0 y 25%):");
        int iva = teclado.nextInt();

        double base = total / (1 + iva / 100.0);
        double importeIva = total - base;

        base = (int) (base * 100 + 0.5) / 100.0;
        importeIva = (int) (importeIva * 100 + 0.5) / 100.0;

        System.out.println("Compra: " + base);
        System.out.println("IVA: " + importeIva);
        System.out.println("======");
        System.out.println(total);
    }
    }



