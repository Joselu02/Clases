import model.Calculadora;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        //ModelViewControl
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce del primer operando");
        int operando1 = lector.nextInt();
        System.out.println("Introduce del segundo operando");
        int operando2 = lector.nextInt();
        System.out.println("Operación (1 suma, 2 resta, 3 multiplicación, 4 división, 5 módulo)");
        int opcion = lector.nextInt();
        lector.close();

        Calculadora calculadora = new Calculadora();

        switch (opcion) {
            case 1:
                calculadora.sumar(operando1, operando2);
                break;
            case 2:
                calculadora.restar(operando1, operando2);
                break;
            case 3:
                calculadora.multiplicar(operando1, operando2);
                break;
            case 4:
                calculadora.dividir(operando1, operando2);
                break;
            case 5:
                calculadora.modulo(operando1, operando2);
                break;
            default:
                System.out.println("Opción no válida");
        }

        System.out.println("El resultado es: " + calculadora.getResultado());
        System.out.println("El tipo de operacion es: " + calculadora.getTipoOperacion());

    }
}
