import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        //void significa que no retorna nada
        /*
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
        System.out.println("Nota:" +nota); */

        int operando1 = 10;
        int operando2 = 5;

        operando1++;
        operando1++;
        operando1++; //13

        operando2--;
        operando2--;
        operando2--; //2

        int suma = operando1 + operando2; //15
        int resta = operando1 - operando2; //11
        int multiplicacion = operando1 * operando2; //26
        double division = (double)operando1 / operando2;//6.5 porque le pongo double si no daria 6.0
        int resto = operando1 % operando2; //13%2 -> 1 (resto de la division)

        System.out.println("Suma:" +suma);
        System.out.println("Resta:" +resta);
        System.out.println("Multiplicacion:" +multiplicacion);
        System.out.println("Division:" +division);
        System.out.println("Resto:" +resto);


        operando1 = 10;
        operando2 = 7;

        System.out.println("La suma de los operandos es: "+ (operando1+operando2));
        String op1 = "5";
        String op2 = "15";

        System.out.println("La suma de los numeros es: " +
                (Integer.parseInt(op1) + Integer.parseInt(op2)));

        //Asignacion

        operando1 = 20;
        operando2 = 10;

        operando1 +=14; //operando1 = operando1+14; //34

        operando1 -=4; //30

        operando1 *=2; //60
        operando1 /=2; //6
        operando1 *= operando2; // 60
        // operando1 %=2; //0

        //relacionales (siempre boolean) > >= < <= 00 !=

        operando1 =40;
        operando2= 15;

        boolean comparacion = false;
        comparacion = operando1 < operando2;//false
        System.out.println("La comparacion < es: " +comparacion);
        comparacion = operando1 != operando2; //true
        System.out.println("La comparacion != es: " +comparacion);
        comparacion = operando1 > operando2;//true
        System.out.println("La comparacion > es: " +comparacion);
        comparacion = operando1 <= operando2;//false
        System.out.println("La comparacion <= es: " +comparacion);


        //logicos AND &&   OR ||

        operando1 = 10;
        operando2 = 20;

        boolean resultadologico = operando1<10 && operando2*2>30; //false
        System.out.println("La resultadologico es: " +resultadologico);
        resultadologico = operando1<10 || operando2*2>30; //true
        System.out.println("La resultadologico es: " +resultadologico);




    }


}

