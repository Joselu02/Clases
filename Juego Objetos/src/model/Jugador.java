package model;

public class Jugador {
    //Atributos -> variables que cualifican
    private String nombre,correo;
    private int vidas,habilidad;
    private boolean estrella;

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

    public Jugador(String nombre, int vidas, int habilidad, boolean estrella, String correo) {
        this.nombre = nombre;
        this.vidas = vidas;
        this.habilidad = habilidad;
        this.estrella = estrella;
        this.correo = correo;
    }

    public Jugador(String nombre, int vidas) {
        this.nombre = nombre;
        this.vidas = vidas;
    }

    public Jugador(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }
    //metodos -> funcionalidades

    public void saludar(){
        System.out.println("Hola me llamo "+nombre);
        System.out.printf("Tengo %d vidas\n",vidas);
    }

    public void saludar(String mensaje){
        System.out.println(mensaje);
    }

    public void recibirImpacto() {
        if (vidas==0){
            System.out.println("Estoy muerto");
        } else if (vidas < 0){
            System.out.println("Para, ya estoy muerto");
        } else {
            vidas--;
        }
    }

    public void setNombre(String nombre) {
        if (nombre.equals("Bartolito") || nombre.equals("Bartolito") || nombre.length()==0){
            System.out.println("No se permite el cambio");
        } else {

            this.nombre = nombre;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public boolean isEstrella() {
        return estrella;
    }

    public int getVidas() {
        return vidas;
    }

    public int getHabilidad() {
        return habilidad;
    }
}


