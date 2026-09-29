import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce op1");
        int op1 = lector.nextInt();
        System.out.println("Introduce op2");
        int op2 = lector.nextInt();
        lector.close();
        int suma = op1 + op2;
        int resta = op1 - op2;
        int multiplicacion = op1 * op2;
        int division = op1 / op2;
        int modulo = op1 % op2;
        double divisionreal = op1 / op2;
        double moduloreal = op1 % op2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
        System.out.println("Modulo: " + modulo);
        System.out.println("Divisionreal: " + divisionreal);
        System.out.println("Moduloreal: " + moduloreal);

    }
}
