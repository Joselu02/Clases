//Ejercicio 12

import java.util.Scanner;

public class Ejercicios2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escribe una palabra: ");
        String palabra1 = teclado.nextLine();

        System.out.print("Escribe una palabra: ");
        String palabra2 = teclado.nextLine();

        boolean iguales = palabra1.equals(palabra2);
        boolean primeraMenor = palabra1.compareTo(palabra2) < 0;
        boolean distintas = !iguales;

        System.out.println("Son iguales: " + iguales);
        System.out.println("La primera es menor que la segunda: " + primeraMenor);
        System.out.println("Son distintas: " + distintas);
    }
}
