import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Cantidad de grados C a pasar");
        final double Factor_Corrector = 273.15;//Hacerlos varaiables y sustituir
        double gradosC = lector.nextDouble();
        double gradosF = (9*gradosC)/5 + 32; //sale en el enunciado
        double gradosK = gradosC + 273.15;
        System.out.println("Las conversiones de C son:");
        System.out.printf("%.2f ºC son %.2f ºF y %.2f ºK\n",gradosC,gradosF,gradosK);
        System.out.println("Cantidad de grados F a pasar");
        gradosF = lector.nextDouble();
        gradosC = (5*(gradosF-32))/9;
        gradosK = gradosC + 273.15;
        System.out.println("Las conversiones de F son:");
        System.out.printf("%.2f ºF son %.2f ºC y %.2f ºK\n",gradosF,gradosC,gradosK);
        System.out.println("Cantidad de grados K a pasar");
        gradosK = lector.nextDouble();
        lector.close();
        gradosC = gradosK - 273.15;
        gradosF = (9*gradosC)/5 +32;
        System.out.println("Las conversiones de K son:");
        System.out.printf("%.2f ºK son %.2f ºC y %.2f ºF\n",gradosK,gradosC,gradosF);

    }
}
