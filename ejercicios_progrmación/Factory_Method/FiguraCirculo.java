public class FiguraCirculo extends Figura {
    private double radio;
    public FiguraCirculo(double radio) {
        this.radio = radio;
    }
    public double CalcularArea() {
        return Math.PI * radio*radio;
    }
}