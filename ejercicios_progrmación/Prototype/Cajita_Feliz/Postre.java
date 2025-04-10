package Prototype.Cajita_Feliz;

public class Postre extends Duplicado {
    public String tipo;
    public String tamaño;
    public String sabor;
    public String cantidad;
    // Construcción del postre
    Postre(String tipo, String tamaño, String sabor, String cantidad) {
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.sabor = sabor;
        this.cantidad = cantidad;
    }
    // Método duplicar postre
    public Postre duplicar() {
        Postre postre = new Postre(
            this.tipo,
            this.tamaño,
            this.sabor,
            this.cantidad
        );
        return postre;
    }
    
}
