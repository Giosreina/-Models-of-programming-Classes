package Prototype;
public class CuadradoVentana {
    private int lado;
    private CirculoVentana circulo;
    private int cantidad;   
    public CuadradoVentana(int lado, CirculoVentana circulo, int cantidad){
        this.circulo = circulo;
        this.cantidad = 0;
        this.lado = 0;
    }
    public int getLado(){
        return this.lado;
    }
    public void setLado(int lado){
        this.lado = lado;
    }
    public CirculoVentana getCirculo(){
        return this.circulo;
    }
    public void setCirculo(CirculoVentana circulo){
        this.circulo = circulo;
    }
    public int getCantidad(){
        return this.cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    public CuadradoVentana duplicar(){
        return new CuadradoVentana(this.lado, this.circulo.duplicar(), this.cantidad);
    }
}