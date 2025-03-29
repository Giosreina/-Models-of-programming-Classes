package Abstract_Factory;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        SumaCliente suma = new SumaCliente();
        suma.sumar();
        suma.restar();
        suma.multiplicar();
        suma.dividir();
    }
}