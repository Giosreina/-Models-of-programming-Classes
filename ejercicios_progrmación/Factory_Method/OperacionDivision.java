public class OperacionDivision extends Operaciones {
    Operaciones resta = new OperacionResta();
    public double Operar(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        boolean esNegativo = (a < 0) != (b< 0);
        double dividendo = Math.abs(a);
        double divisor = Math.abs(b);
        double cociente = 0;
        while (dividendo >= divisor) {
            a = resta.Operar(a, b);
            cociente++;
        }
        return esNegativo ? -cociente : cociente;
    }
}