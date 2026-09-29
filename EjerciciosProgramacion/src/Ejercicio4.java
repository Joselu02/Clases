import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
       final double precioBebida = 1.25;
       final double precioBocata = 2.05;
        Scanner lector = new Scanner(System.in);
        System.out.println("Cuantas bebidas vas a pedir");
        int bebidas = lector.nextInt();
        System.out.println("Cuantos bocatas vas a pedir");
        int bocata = lector.nextInt();
        lector.close();
        double precioBocatas = precioBebida * bebidas;
        double precioBocataas = precioBocata * bocata;
        double precioTotal = precioBocatas + precioBocataas;
        System.out.println("El precio de las bebidas es: " + precioBebida);
        System.out.println("El precio de las bocatas es: " + precioBocata);
        System.out.println("El precio total es: " + precioTotal);
    }
}
