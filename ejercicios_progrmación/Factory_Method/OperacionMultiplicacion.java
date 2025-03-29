public class OperacionMultiplicacion extends Operaciones {
    Operaciones suma = new OperacionSuma();
    public double Operar(double a, double b) {
        double c = 0;
        for (int i = 0; i < b; i++) {
            c = suma.Operar(c, a);
        }
        return c;
    }
}