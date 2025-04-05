package Prototype.Cajita_Feliz;

public class Postre extends Duplicado {
    public String tipo;
    public String tamaño;
    public String sabor;
    public String cantidad;

    // Métodos setter y getter del postre
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public String getSabor() {
        return sabor;
    }

    public String getCantidad() {
        return cantidad;
    }

    // Método duplicar postre
    public Postre duplicar() {
        Postre postre = new Postre();
        postre.setTipo(this.tipo);
        postre.setTamaño(this.tamaño);
        postre.setSabor(this.sabor);
        postre.setCantidad(this.cantidad);
        return postre;
    }
    
}
