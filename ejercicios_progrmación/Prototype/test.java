package Prototype;
public class test {
    public static void main(String[] args) {

        TrianguloTecho trianguloTecho = new TrianguloTecho();
        trianguloTecho.setBase(3);
        trianguloTecho.setAltura(4);
        trianguloTecho.setCantidad(2);

        RectangulosParedes rectangulosParedes = new RectangulosParedes();
        rectangulosParedes.setLargo(10);
        rectangulosParedes.setAncho(5);
        rectangulosParedes.setCantidad(2);
        rectangulosParedes.setCuadrado(new CuadradoVentana(4, new CirculoVentana(5), 2));
        rectangulosParedes.setTrianguloTecho(trianguloTecho);
        
        
        RectangulosParedes nuevoRectangulo = rectangulosParedes.duplicar();
        
        System.out.println("Rectángulo original: " + rectangulosParedes.getLargo() + "x" + rectangulosParedes.getAncho());
        System.out.println("Nuevo Rectángulo: " + nuevoRectangulo.getLargo() + "x" + nuevoRectangulo.getAncho());
    }
}
