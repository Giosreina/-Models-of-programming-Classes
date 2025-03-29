package Abstract_Factory;
public class SalidaTerminal extends ProductoSalida {
    String mensaje;
    
    public String capturar() {
        return "";
    }
    
    public void enviar(String mensaje) {
        this.mensaje = mensaje;
        System.out.println(mensaje);
    }
}