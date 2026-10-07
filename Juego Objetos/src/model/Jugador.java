package model;

public class Jugador {
    //Atributos -> variables que cualifican
    public String nombre,correo;
    public int vidas,habilidad;
    public boolean estrella;

    //Contructores -> Hace realidad el objeto
    public Jugador(){
        this.nombre = "Bot";
        this.estrella = true;
        this.habilidad = (int)(Math.random()*101); // 0 - 0.999999  el *101 es para que sea -> 0 - 100.99999 con el int quito los decimales // se pone entre parentesis para que no sea 0 siempre
        this.correo = "sistema@gmail.com";
    }//Constructor Vacio. Enmascarado Siempre se pone



    public Jugador(String nombre, int vidas, int habilidad, boolean estrella) {
        this.nombre = nombre;
        this.vidas = vidas;
        this.habilidad = habilidad;
        this.estrella = estrella;
    }

    public Jugador(String nombre, int vidas) {
        this.nombre = nombre;
        this.vidas = vidas;
    }
    //metodos -> funcionalidades

    public void saludar(){
        System.out.println("Hola me llamo "+nombre);
        System.out.printf("Tengo %d vidas\n",vidas);
    }
}
