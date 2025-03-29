import java.io.IOException;
import Abstract_Factory.*;
public class Test{
    public static void main(String[] args) throws IOException {
        ProductoSalida salida = new SalidaTerminal();
        ProductoEntrada entrada = new EntradaTerminal();
        Figura figura;
        double area = 0;
        FabricaFiguras cuadrado = new FabricaCuadrado();
        figura = cuadrado.crearFigura();
        area = figura.CalcularArea();
        salida.enviar("El area del cuadrado es: " + area);

        FabricaFiguras circulo = new FabricaCirculo();
        figura = circulo.crearFigura();
        area = figura.CalcularArea();
        salida.enviar("El area del circulo es: " + area);

        FabricaFiguras triangulo = new FabricaTriangulo();
        figura = triangulo.crearFigura();
        area = figura.CalcularArea();
        salida.enviar("El area del triangulo es: " + area);

        double operador1 , operador2;
        Operaciones operaciones;
        FabricaOperaciones suma = new FabricaSuma();
        operaciones = suma.crearOperaciones();
        salida.enviar("Ingresa dos numeros: ");
        operador1 = Double.parseDouble(entrada.capturar());
        operador2 = Double.parseDouble(entrada.capturar());
        double resultado = operaciones.Operar(operador1, operador2);
        salida.enviar("El resultado de la suma es: " + resultado);

        FabricaOperaciones resta = new FabricaResta();
        operaciones = resta.crearOperaciones();
        salida.enviar("Ingresa dos numeros: ");
        operador1 = Double.parseDouble(entrada.capturar());
        operador2 = Double.parseDouble(entrada.capturar());
        resultado = operaciones.Operar(operador1, operador2);
        salida.enviar("El resultado de la resta es: " + resultado);

        FabricaOperaciones multiplicacion = new FabricaMultiplicacion();
        operaciones = multiplicacion.crearOperaciones();
        salida.enviar("Ingresa dos numeros: ");
        operador1 = Double.parseDouble(entrada.capturar());
        operador2 = Double.parseDouble(entrada.capturar());
        resultado = operaciones.Operar(operador1, operador2);
        salida.enviar("El resultado de la multiplicacion es: " + resultado);

        FabricaOperaciones division = new FabricaDivision();
        operaciones = division.crearOperaciones();
        salida.enviar("Ingresa dos numeros: ");
        operador1 = Double.parseDouble(entrada.capturar());
        operador2 = Double.parseDouble(entrada.capturar());
        resultado = operaciones.Operar(operador1, operador2);
        salida.enviar("El resultado de la division es: " + resultado);
    }
}