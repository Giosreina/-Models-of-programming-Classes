package Abstract_Factory;

import javax.swing.*;
import java.awt.event.*;

public class EntradaGrafico extends ProductoEntrada {
    private String entrada;

    public String capturar() {
        JFrame frame = new JFrame("Entrada Gráfica");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Aceptar");

        final Object lock = new Object();

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                entrada = textField.getText();
                synchronized (lock) {
                    lock.notify(); // desbloquea el hilo principal
                }
                frame.dispose();
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Ingresa un mensaje:"));
        panel.add(textField);
        panel.add(button);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Esperar a que se presione el botón
        synchronized (lock) {
            try {
                lock.wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        return entrada;
    }
}



