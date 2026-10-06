import model.Jugador;

public class Entrada {

    public static void main(String[] args) {
        System.out.println("Iniciamos el juego de los objetos");

        Jugador jugador1 = new Jugador();
        //Edad-correo-nombre-vida-habilidad-estrella
        jugador1.nombre = "Jose";
        jugador1.numeroVidas = 5;
        jugador1.estrella = true;
        System.out.println(jugador1.nombre);
        System.out.println(jugador1.numeroVidas);
        System.out.println(jugador1.estrella);

        Jugador jugador2 = new Jugador("Juan",5,100,true);
        System.out.println(jugador2.nombre);
        System.out.println(jugador2.numeroVidas);
        System.out.println(jugador2.estrella);
    }
}
