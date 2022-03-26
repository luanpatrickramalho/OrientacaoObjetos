package br.com.letscode.poo.entity;

public class Moto extends Automovel{

    private double cilindradas;

    public Moto(String fabricante, String modelo, int ano, String tipoCombustaoEnum, double preco, double cilindradas) {
        super(fabricante, modelo, ano, tipoCombustaoEnum, preco);
        this.cilindradas = cilindradas;
    }

    public double getCilindradas() { return cilindradas; }
    public void setCilindradas(double cilindradas) { this.cilindradas = cilindradas; }

}
