public class OperacionResta extends Operaciones {
    Operaciones suma = new OperacionSuma();
    public double Operar(double a, double b) {
        return Math.abs(suma.Operar(a, -b));
    }
}