package Prototype; 
public class CirculoVentana {
    private int radio;
    public int getRadio(){
        return this.radio;
    }
    public void setRadio(int radio){
        this.radio = radio;
    }
    public CirculoVentana duplicar(){
        CirculoVentana circulo = new CirculoVentana();
        circulo.setRadio(this.radio);
        return circulo;
    }
}