package Composite;

public class Carro extends Vehiculo {
    private double peso;
    private String[] coordenadas;
    private String placa;
    private String modelo;

    public Carro(double peso, String placa, String modelo) {
        this.peso = peso;
        this.placa = placa;
        this.modelo = modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getModelo() {
        return modelo;
    }   
    public void setCoordenadas(String[] coordenadas) {
        this.coordenadas = coordenadas;
    }
    @Override
    public double calcularPeso() {
        return this.peso;
    }
    @Override
    public void getCoordenadas(Carro carro) {
        System.out.println("Coordenadas del carro: " + this.coordenadas);
    }

}
