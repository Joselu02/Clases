import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        //void significa que no retorna nada
        System.out.println("Protecto operadores");
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = lector.nextLine();
        System.out.println("Introduce tu ciclo: ");
        String ciclo = lector.nextLine();
        System.out.println("Introduce la nota del examen: ");
        int nota = lector.nextInt();

        System.out.println("Nombre:" +nombre);
        System.out.println("Ciclo:" +ciclo);
        System.out.println("Nota:" +nota);
        System.out.println("Introduce el valor del examen: (PRUEBA)");

    }


}

