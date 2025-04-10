package Prototype.Cajita_Feliz;
//Producto CajitaFeliz para diplicar
//Herencia de la clase Duplicado
public class CajitaFeliz extends Duplicado {
    /// Atributos de la cajita feliz
    public Hamburguesa hamburguesa;
    public PapasFritas papasFritas;
    public Bebida bebida;
    public Postre postre;
    public Juguete juguete;
    public int precio;

    //Metodos setter y getter de la cajita feliz
    public void setHamburguesa(Hamburguesa hamburguesa) {
        this.hamburguesa = hamburguesa;
    }

    public void setPapasFritas(PapasFritas papasFritas) {
        this.papasFritas = papasFritas;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public void setPostre(Postre postre) {
        this.postre = postre;
    }

    public void setJuguete(Juguete juguete) {
        this.juguete = juguete;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Hamburguesa getHamburguesa() {
        return hamburguesa;
    }

    public PapasFritas getPapasFritas() {
        return papasFritas;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public Postre getPostre() {
        return postre;
    }

    public Juguete getJuguete() {
        return juguete;
    }
    public int getPrecio() {
        return precio;
    }
    //Duplicar la cajita feliz
    public CajitaFeliz duplicar(){
        CajitaFeliz cajitaFeliz = new CajitaFeliz();
        cajitaFeliz.setHamburguesa(this.hamburguesa.duplicar());
        cajitaFeliz.setPapasFritas(this.papasFritas.duplicar());
        cajitaFeliz.setBebida(this.bebida.duplicar());
        cajitaFeliz.setPostre(this.postre.duplicar());
        cajitaFeliz.setJuguete(this.juguete.duplicar());
        cajitaFeliz.setPrecio(this.precio);
        return cajitaFeliz;
    }
}
