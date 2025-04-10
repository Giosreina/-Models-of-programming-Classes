package Prototype.Cajita_Feliz;
//Creación de la clase Juguete
public class Juguete extends Duplicado{
    String tipo;
    String tamaño;
    String color;
    //Construcción del juguete
    Juguete(String tipo, String tamaño, String color) {
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.color = color;
    }
    //Duplicado del juguete
    public Juguete duplicar() {
        Juguete juguete = new Juguete(
            this.tipo,
            this.tamaño,
            this.color
        );
        return juguete;
    }
}
