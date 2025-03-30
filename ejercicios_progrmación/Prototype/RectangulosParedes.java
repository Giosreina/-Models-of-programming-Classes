package Prototype;
public class RectangulosParedes {
    private int largo;
    private int ancho;
    private int cantidad;
    private CuadradoVentana cuadrado;
    private TrianguloTecho trianguloTecho;
    
    public CuadradoVentana getCuadrado(){
        return this.cuadrado;
    }
    public void setCuadrado(CuadradoVentana cuadrado){
        this.cuadrado = cuadrado;
    }
    public TrianguloTecho getTrianguloTecho(){
        return this.trianguloTecho;
    }
    public void setTrianguloTecho(TrianguloTecho trianguloTecho){
        this.trianguloTecho = trianguloTecho;
    }
    public int getLargo(){
        return this.largo;
    }
    public void setLargo(int largo){
        this.largo = largo;
    }
    public int getAncho(){
        return this.ancho;
    }
    public void setAncho(int ancho){
        this.ancho = ancho;
    }
    public int getCantidad(){
        return this.cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    public RectangulosParedes duplicar(){
        RectangulosParedes rectangulosParedes = new RectangulosParedes();
        rectangulosParedes.setLargo(this.largo);
        rectangulosParedes.setAncho(this.ancho);
        rectangulosParedes.setCantidad(this.cantidad);
        rectangulosParedes.setCuadrado(this.cuadrado.duplicar());
        rectangulosParedes.setTrianguloTecho(this.trianguloTecho.duplicar());
        return rectangulosParedes;
    }
}