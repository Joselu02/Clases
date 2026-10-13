package model;

public class Calculadora {
    //atributos
        //operador1 , operador2, tipoOperacion, resultado
    private int operando1, operando2;

    private double resultado;

    private String tipoOperacion;

    //constructores -> el vacio lo tengo por defecto
    public Calculadora(){}

    //metodos
        //suma, resta, multiplica, divide, modulo
    public void sumar(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = this.operando1 + this.operando2;
        this.tipoOperacion = "Suma";
        System.out.println("Suma terminada");
    }

    public void restar(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = this.operando1 - this.operando2;
        this.tipoOperacion = "Resta";
        System.out.println("Resta terminada");
    }

    public void multiplicar(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = this.operando1 * this.operando2;
        this.tipoOperacion = "Multiplicación";
        System.out.println("Multiplicación terminada");
    }

    public void dividir(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
        if (this.operando2 == 0) {
            System.out.println("No se puede dividir entre 0");

        } else {
            this.resultado = (double) this.operando1 / this.operando2;
            this.tipoOperacion = "División";
            System.out.println("División terminada");
        }
    }

    public void modulo(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
        if (this.operando2 == 0) {
            System.out.println("No se puede calcular el módulo entre 0");

        } else {
            this.resultado = this.operando1 % this.operando2;
            this.tipoOperacion = "Módulo";
            System.out.println("Módulo terminado");
        }
    }

    public double getResultado() {
        return resultado;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }
}
