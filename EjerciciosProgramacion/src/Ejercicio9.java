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
