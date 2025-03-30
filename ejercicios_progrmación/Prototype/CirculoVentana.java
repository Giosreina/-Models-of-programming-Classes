package Prototype; 
public class CirculoVentana {
    private int radio;
    public CirculoVentana(int radio){
        this.radio = 0;
    }
    public int getRadio(){
        return this.radio;
    }
    public void setRadio(int radio){
        this.radio = radio;
    }
    public CirculoVentana duplicar(){
        return new CirculoVentana(this.radio);
    }
}