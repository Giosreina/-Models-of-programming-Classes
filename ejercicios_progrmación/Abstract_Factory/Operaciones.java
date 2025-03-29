package Abstract_Factory;
public class Operaciones {
    public int sumar(int a, int b) {
        return a + b;
    }
    public int multiplicar(int a, int b) {
        int c = 0;
        for (int i = 0; i < b; i++) {
            c = sumar(c, a);
        }
        return c;
    }
    public int restar(int a, int b) {
        return Math.abs(sumar(a, -b));
    }
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        int dividendo = Math.abs(a);
        int divisor = Math.abs(b);
        int cociente = 0;
        while (dividendo >= divisor) {
            a = restar(a, b);
            cociente++;
        }
        return cociente;
    }
}
