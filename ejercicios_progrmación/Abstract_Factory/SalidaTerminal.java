package Abstract_Factory;
public class SalidaTerminal extends ProductoSalida {
    String mensaje;
    public void enviar(String mensaje) {
        this.mensaje = mensaje;
        System.out.println(mensaje);
    }
}