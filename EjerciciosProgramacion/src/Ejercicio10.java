import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("dmillar");
        int dmillar = lector.nextInt();
        System.out.println("umillar");
        int umillar = lector.nextInt();
        System.out.println("centenas");
        int centenas = lector.nextInt();
        System.out.println("decenas");
        int decenas = lector.nextInt();
        System.out.println("unidades");
        int unidades = lector.nextInt();
        System.out.println("El numero completo es "+dmillar+umillar+centenas+decenas+unidades);
        System.out.println(""+dmillar+umillar+centenas+decenas+unidades);
        System.out.println(dmillar+umillar+centenas+decenas+unidades);
        System.out.println("Indicame el numero completo");
        int numeroCompleto = lector.nextInt();//56789
        dmillar = numeroCompleto/10000; // 56789 -> 5
        umillar = (numeroCompleto%10000)/1000; // 6789 -> 6
        centenas = ((numeroCompleto%10000)%1000)/100; // 789 -> 7
        decenas = (((numeroCompleto%10000)%100)%100)/10;// 89 -> 8
        unidades = (((numeroCompleto%10000)%100)%100)%10;// 9

        System.out.println("La descomposicion es");
        System.out.println("d millar "+dmillar);
        System.out.println("u millar "+umillar);
        System.out.println("centenas "+centenas);
        System.out.println("decenas "+decenas);
        System.out.println("unidades "+unidades);

        //Repasar

        lector.close();
    }
}
