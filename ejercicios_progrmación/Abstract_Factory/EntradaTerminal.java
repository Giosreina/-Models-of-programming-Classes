package Abstract_Factory;
import java.util.Scanner;

public class EntradaTerminal extends ProductoEntrada {
    Scanner sc = new Scanner(System.in);
    String entrada;
    public String capturar() {
        this.entrada = sc.nextLine();
        return this.entrada;
    }
}
