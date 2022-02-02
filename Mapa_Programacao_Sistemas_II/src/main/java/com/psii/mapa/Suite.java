package com.psii.mapa;

public class Suite {

    private int numero;
    private String tipo;
    private int capacidade;
    private double diaria;

    public Suite() {}

    public Suite(int numero, String tipo, int capacidade, double diaria) {
        this.numero = numero;
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.diaria = diaria;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getDiaria() {
        return diaria;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    public String mostrarSuite() {
        return "Nº: " + getNumero() + "\nTipo de Quarto: " + getTipo()
                + "\nCapacidade do Quarto: " + getCapacidade() + "\nCusto da Diaria: " + getDiaria();
    }
}
