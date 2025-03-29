package Abstract_Factory;
import javax.swing.*;
public class EntradaGrafico extends ProductoEntrada{
    public String entrada;
    public String capturar() {
        this.entrada = "";
        return JOptionPane.showInputDialog(null, entrada, "entrada", JOptionPane.INFORMATION_MESSAGE);
    }
}


