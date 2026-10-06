package model;

public class Jugador {
    //Atributos -> variables que cualifican
    public String nombre,correo;
    public int numeroVidas,habilidad;
    public boolean estrella;

    //Contructores -> Hace realidad el objeto
    public Jugador(){} //Constructor Vacio. Enmascarado
    public Jugador(String nombreParametro, int vidasParametro, int habilidadParametro, boolean estrellaParametro) {
        nombre = nombreParametro;
        numeroVidas = vidasParametro;
        habilidad = habilidadParametro;
        estrella = estrellaParametro;
    }

    //metodos -> funcionalidades
}
