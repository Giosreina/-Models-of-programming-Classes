package Prototype;
public class TrianguloTecho {
    private int lado;
    private int altura;
    private int cantidad;
    private CuadradoVentana cuadrado;
    private CirculoVentana circulo;

    public CuadradoVentana getCuadrado(){
        return this.cuadrado;
    }
    public void setCuadrado(CuadradoVentana cuadrado){
        this.cuadrado = cuadrado;
    }
    public CirculoVentana getCirculo(){
        return this.circulo;
    }
    public void setCirculo(CirculoVentana circulo){
        this.circulo = circulo;
    }
    public int getLado(){
        return this.lado;
    }
    public void setLado(int lado){
        this.lado = lado;
    }
    public int getAltura(){
        return this.altura;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }
    public int getCantidad(){
        return this.cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    public TrianguloTecho duplicar(){
        TrianguloTecho trianguloTecho = new TrianguloTecho();
        trianguloTecho.setLado(this.lado);
        trianguloTecho.setAltura(this.altura);
        trianguloTecho.setCantidad(this.cantidad);
        trianguloTecho.setCuadrado(this.cuadrado.duplicar());
        trianguloTecho.setCirculo(this.circulo.duplicar());
        return trianguloTecho;
    }
}
