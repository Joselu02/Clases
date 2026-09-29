import java.util.Scanner;

public class Ejercicio5 {

    //Programa que convierta segs en horas, mins y segs. (SEGUNDOS)

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Indica cuantos segundos quieres pasar: ");
        int segundosSistema = lector.nextInt();
        // 1 hora -> 3600s
        // 1 hora -> 60 mins
        // 1 minuto -> 60 segs
        lector.close();

        //34567 segs ejemplo

        int horas = segundosSistema / 3600; //9,601
        System.out.println("Horas: " + horas);
        int segundosRestantes =  segundosSistema % 3600;
        int minutos = segundosRestantes / 60;
        System.out.println("Minutos: " + minutos);
        int segundos  = segundosRestantes % 60;
        System.out.println("Segundos: " + segundos);

        lector.close();
    }
}
