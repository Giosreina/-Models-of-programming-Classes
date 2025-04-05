package Prototype.Cajita_Feliz;

public class PapasFritas extends Duplicado {
    public String tipo;
    public String tamaño;
    public String salsas;
    public String cantidad;

    //Métodos setter y getter de las papas fritas
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    public void setSalsas(String salsas) {
        this.salsas = salsas;
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
    public String getSalsas() {
        return salsas;
    }
    public String getCantidad() {
        return cantidad;
    }
    //Método duplicar papas fritas
    public PapasFritas duplicar() {
        PapasFritas papasFritas = new PapasFritas();
        papasFritas.setTipo(this.tipo);
        papasFritas.setTamaño(this.tamaño);
        papasFritas.setSalsas(this.salsas);
        papasFritas.setCantidad(this.cantidad);
        return papasFritas;
    }
}
