package Abstract_Factory;
public class Adaptador {
    public String adaptar(String entrada) {
        String entradaAdaptada = Integer.parseInt(entrada);
        return entradaAdaptada;
    }
}
