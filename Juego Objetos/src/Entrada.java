import model.Jugador;

public class Entrada {

    public static void main(String[] args) {
        System.out.println("Iniciamos el juego de los objetos");

        Jugador jugador1 = new Jugador("Jose",10,100,true);
        //Edad-correo-nombre-vida-habilidad-estrella

        Jugador jugador2 = new Jugador("Juan",5,100,true,"juan@gmail.com");

        Jugador jugador3 = new Jugador("Marcos",7);

        Jugador jugador4 = new Jugador("Borja", "borja@gmail.com");

        Jugador jugador5 = new Jugador();

        //jugador2.nombre = "Pepito"; esto ya no deja por estan privadas en jugador

        jugador2.setNombre("Pepito"); //Asi si puedo cambiarlo por el metodo set

        System.out.println("El nombre del jugador es: "+jugador1.getNombre());

        System.out.println("El nombre del jugador es: "+jugador2.getNombre());
        System.out.println("El nombre del jugador es: "+jugador2.getCorreo());
        System.out.println("El nombre del jugador es: "+jugador2.isEstrella());
        System.out.println("El nombre del jugador es: "+jugador2.getVidas());
        System.out.println("El nombre del jugador es: "+jugador2.getHabilidad());

       /* jugador1.saludar();
        jugador2.saludar();

        jugador2.recibirImpacto();
        jugador2.recibirImpacto();
        jugador2.recibirImpacto();

        jugador2.saludar();*/



    }
}
