package Abstract_Factory;
import javax.swing.*;
public class SalidaGrafico extends ProductoSalida {
    public String capturar(String mensaje) {
        return null;
    }
    public void enviar(String mensaje) {
        JOptionPane.showInputDialog(null, mensaje, "entrada", JOptionPane.INFORMATION_MESSAGE);
    }
}