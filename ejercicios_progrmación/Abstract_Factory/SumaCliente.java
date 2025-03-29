package Abstract_Factory;
import java.io.IOException;
public class SumaCliente {
    int operando1, operando2;
    Operaciones operaciones = new Operaciones();
    public void sumar() throws IOException{
        Cliente cliente = new Cliente(new FabricaTerminal());
        cliente.salida.enviar("Ingresa un numero: ");
        operando1 = Integer.parseInt(cliente.entrada.capturar());
        cliente.salida.enviar("Ingresa otro numero: ");
        operando2 = Integer.parseInt(cliente.entrada.capturar());
        cliente.salida.enviar("El resultado es: " + operaciones.sumar(operando1, operando2));   
    }
    public void restar() throws IOException{
        Cliente cliente = new Cliente(new FabricaTerminal());
        cliente.salida.enviar("Ingresa un numero: ");
        operando1 = Integer.parseInt(cliente.entrada.capturar());
        cliente.salida.enviar("Ingresa otro numero: ");
        operando2 = Integer.parseInt(cliente.entrada.capturar());
        cliente.salida.enviar("El resultado es: " + operaciones.restar(operando1, operando2));   
    }
    public void multiplicar() throws IOException{
        Cliente cliente = new Cliente(new FabricaTerminal());
        cliente.salida.enviar("Ingresa un numero: ");
        operando1 = Integer.parseInt(cliente.entrada.capturar());
        cliente.salida.enviar("Ingresa otro numero: ");
        operando2 = Integer.parseInt(cliente.entrada.capturar());
        cliente.salida.enviar("El resultado es: " + operaciones.multiplicar(operando1, operando2));   
    }
    public void dividir() throws IOException{
        Cliente cliente = new Cliente(new FabricaTerminal());
        cliente.salida.enviar("Ingresa el dividendo: ");
        operando1 = Integer.parseInt(cliente.entrada.capturar());
        cliente.salida.enviar("Ingresa el divisor: ");
        operando2 = Integer.parseInt(cliente.entrada.capturar());
        cliente.salida.enviar("El resultado es: " + operaciones.dividir(operando1, operando2));   
    }
}