package Prototype.Cajita_Feliz;
//Creación de la clase Hamburguesa
public class Hamburguesa extends Duplicado {
    public String carne;
    public String pan;
    public String lechuga;
    public String tomate;
    public String cebolla;
    public String salsas;
    public String tamaño;

    //Construcción de la hamburguesa
    Hamburguesa(String carne, String pan, String lechuga, String tomate, String cebolla, String salsas, String tamaño) {
        this.carne = carne;
        this.pan = pan;
        this.lechuga = lechuga;
        this.tomate = tomate;
        this.cebolla = cebolla;
        this.salsas = salsas;
        this.tamaño = tamaño;
    }
    //Método duplicar hamburguesa
    public Hamburguesa duplicar() {
        Hamburguesa hamburguesa = new Hamburguesa(
            this.carne,
            this.pan,
            this.lechuga,
            this.tomate,
            this.cebolla,
            this.salsas,
            this.tamaño
        );
        return hamburguesa;
    }
}
