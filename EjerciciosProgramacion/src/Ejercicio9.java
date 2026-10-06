import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Cuantas bebidas pides");
        int nBebidas = lector.nextInt();
        System.out.println("Cuanto vale cada bebida");
        double valorBebida = lector.nextDouble();
        System.out.println("Cuantos bocatas pides");
        int nBocatas = lector.nextInt();
        System.out.println("Cuanto vale cada bocata");
        double valorBocata = lector.nextDouble();
        System.out.println("Cuantos sois");
        int comensales = lector.nextInt();
        lector.close();
        double costeBebidas = nBebidas*valorBebida;
        double costeBocata = nBocatas*valorBocata;
        double costeTotal = costeBebidas+costeBocata;
        double costeIndividual = costeTotal/comensales;
        System.out.println("ARTICULO\t\t\t\tCANTIDAD\t\t\t\tPRECIO\t\t\t\tCOSTE");
        System.out.printf("%s\t\t\t\t\t%d\t\t\t\t\t%.2f\t\t\t\t\t%.2f\n","Bebida",nBebidas,valorBebida,costeBebidas);
        System.out.printf("%s\t\t\t\t\t%d\t\t\t\t\t%.2f\t\t\t\t\t%.2f\n","Bocata",nBocatas,valorBocata,costeBocata);

        //Terminar

    }
}
/*
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica cuantas bebidas pides");
        int nBebidas = lector.nextInt();
        System.out.println("Indica cuantos bocatas pides");
        int nBocatas = lector.nextInt();
        System.out.println("Indica cuanto vale cada bocata");
        double precioBocata = lector.nextDouble();
        System.out.println("Indica cuanto vale cada bebida");
        double precioBebida = lector.nextDouble();
        System.out.println("Cuantos comensales sois");
        int comensales = lector.nextInt();
        double precioTotalBocatas = nBocatas * precioBocata;
        double precioTotalBebidas = nBebidas * precioBebida;
        double precioTotal = precioTotalBebidas + precioTotalBocatas;
        double precioComensal = precioTotal / comensales;

        System.out.println("Articulo\t\t\t\tCantidad\t\t\t\tPrecio\t\t\t\tTotal");
        System.out.printf("Bebidas\t\t\t\t\t%d\t\t\t\t\t%.2f\t\t\t\t\t%.2f\n", nBebidas, precioBebida, precioTotalBebidas);
        System.out.printf("Bocatas\t\t\t\t\t%d\t\t\t\t\t%.2f\t\t\t\t\t%.2f\n", nBocatas, precioBocata, precioTotalBocatas);
        System.out.printf("Total\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t%.2f\n", precioTotal);
        System.out.printf("Por comensal\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t%.2f\n", precioComensal);
    }
}
 */