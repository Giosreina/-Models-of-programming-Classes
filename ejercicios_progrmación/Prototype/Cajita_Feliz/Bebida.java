package Prototype.Cajita_Feliz;

public class Bebida extends Duplicado{
    public String tipo;
    public String tamaño;
    public String sabor;
    public String cantidad;

    //Métodos setter y getter de la bebida
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

    //Método duplicar bebida
    public Bebida duplicar() {
        Bebida bebida = new Bebida();
        bebida.setTipo(this.tipo);
        bebida.setTamaño(this.tamaño);
        bebida.setSabor(this.sabor);
        bebida.setCantidad(this.cantidad);
        return bebida;
    }
}
