import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        System.out.println("Programa para la explicacion de sentencias");
        System.out.println("Sentencia if");
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el pin");
        int pin = lector.nextInt();
        lector.close();

        if (pin == 1234) {
            System.out.println("El pin correcto");
        } else if (pin == 0000) {
            System.out.println("pin usuario");
        } else {
            System.out.println("El pin incorrecto");
        }

        System.out.println("Terminado");
    }
}
