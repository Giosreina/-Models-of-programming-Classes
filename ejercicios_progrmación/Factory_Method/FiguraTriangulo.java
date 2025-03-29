
public class FiguraTriangulo extends Figura {
    private double lado1;
    private double lado2;
    private double lado3;

    public FiguraTriangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    public double CalcularArea() {
        double SemiPerimetro = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(SemiPerimetro*(SemiPerimetro-lado1)*(SemiPerimetro-lado2)*(SemiPerimetro-lado3));
    }
}