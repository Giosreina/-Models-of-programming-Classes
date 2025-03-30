package Prototype;
public class CuadradoVentana {
    private int lado;
    private CirculoVentana circulo;
    private int cantidad;   
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
        CuadradoVentana cuadrado = new CuadradoVentana();
        cuadrado.setLado(this.lado);
        cuadrado.setCantidad(this.cantidad);
        cuadrado.setCirculo(this.circulo.duplicar());
        return cuadrado;
    }
}