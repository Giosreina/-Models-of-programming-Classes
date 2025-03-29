public class FiguraCuadrado extends Figura {
    private double lado;
    public FiguraCuadrado(double lado) {
        this.lado = lado;
    }
    public double CalcularArea() {
        return lado * lado;
    }
}