package Prototype;
public class TrianguloTecho {
    private int base;
    private int altura;
    private int cantidad;

    public int getBase(){
        return this.base;
    }
    public void setBase(int base){
        this.base = base;
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
        trianguloTecho.setBase(this.base);
        trianguloTecho.setAltura(this.altura);
        trianguloTecho.setCantidad(this.cantidad);
        return trianguloTecho;
    }
}
