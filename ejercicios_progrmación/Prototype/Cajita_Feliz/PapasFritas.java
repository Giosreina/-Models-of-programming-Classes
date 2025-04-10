package Prototype.Cajita_Feliz;

public class PapasFritas extends Duplicado {
    public String tipo;
    public String tamaño;
    public String salsas;
    public String cantidad;
    //Construcción de las papas fritas
    PapasFritas(String tipo, String tamaño, String salsas, String cantidad) {
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.salsas = salsas;
        this.cantidad = cantidad;
    }
    //Método duplicar papas fritas
    public PapasFritas duplicar() {
        PapasFritas papasFritas = new PapasFritas(
            this.tipo,
            this.tamaño,
            this.salsas,
            this.cantidad
        );
        return papasFritas;
    }
}
