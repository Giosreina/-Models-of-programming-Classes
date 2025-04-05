package Prototype.Cajita_Feliz;
//Creación de la clase Hamburguesa
public class Hamburguesa extends Duplicado {
    public String carne;
    public String pan;
    public String lechuga;
    public String tomate;
    public String cebolla;
    public String salsas;

    //Métodos setter y getter de la hamburguesa
    public void setCarne(String carne) {
        this.carne = carne;
    }
    public void setPan(String pan) {
        this.pan = pan;
    }
    public void setLechuga(String lechuga) {
        this.lechuga = lechuga;
    }
    public void setTomate(String tomate) {
        this.tomate = tomate;
    }
    public void setCebolla(String cebolla) {
        this.cebolla = cebolla;
    }
    public void setSalsas(String salsas) {
        this.salsas = salsas;
    }
    public String getCarne() {
        return carne;
    }
    public String getPan() {
        return pan;
    }
    public String getLechuga() {
        return lechuga;
    }
    public String getTomate() {
        return tomate;
    }
    public String getCebolla() {
        return cebolla;
    }
    public String getSalsas() {
        return salsas;
    }
    //Método duplicar hamburguesa
    public Hamburguesa duplicar() {
        Hamburguesa hamburguesa = new Hamburguesa();
        hamburguesa.setCarne(this.carne);
        hamburguesa.setPan(this.pan);
        hamburguesa.setLechuga(this.lechuga);
        hamburguesa.setTomate(this.tomate);
        hamburguesa.setCebolla(this.cebolla);
        hamburguesa.setSalsas(this.salsas);
        return hamburguesa;
    }
}
