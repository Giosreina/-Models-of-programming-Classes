package Abstract_Factory;

import javax.swing.*;

public class SalidaGrafico extends ProductoSalida {
    public void enviar(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Salida Gráfica", JOptionPane.INFORMATION_MESSAGE);
    }
}
