package Prototype.Cajita_Feliz;

public class Bebida extends Duplicado{
    public String tipo;
    public String tamaño;
    public String sabor;
    public String cantidad;

    //Construcción de la bebida 
    Bebida(String tipo, String tamaño, String sabor, String cantidad) {
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.sabor = sabor;
        this.cantidad = cantidad;
    }

    //Método duplicar bebida
    public Bebida duplicar() {
        Bebida bebida = new Bebida(
            this.tipo, 
            this.tamaño,
            this.sabor,
            this.cantidad
        );  
        return bebida;
    }
}
