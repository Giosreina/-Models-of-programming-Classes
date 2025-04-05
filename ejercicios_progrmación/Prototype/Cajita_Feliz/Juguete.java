package Prototype.Cajita_Feliz;

public class Juguete extends Duplicado{
    String tipo;
    String tamaño;
    String color;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getTipo() {
        return tipo;
    }
    public String getTamaño() {
        return tamaño;
    }
    public String getColor() {
        return color;
    }
    public Duplicado duplicar() {
        Juguete juguete = new Juguete();
        juguete.setTipo(this.tipo);
        juguete.setTamaño(this.tamaño);
        juguete.setColor(this.color);
        return juguete;
    }
}
