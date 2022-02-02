package com.psii.mapa;

import java.util.ArrayList;
import java.util.Scanner;

public class Reserva {

    private Suite suiteReserva;
    private ArrayList hospedes;
    private int qtdHospedes;
    private int qtdDiarias;
    private Double valorReserva;

    public ArrayList getHospedes() {
        return hospedes;
    }

    public void setHospedes(ArrayList hospedes) {
        this.hospedes = hospedes;
    }

    Scanner scan = new Scanner(System.in);

    public Double getValorReserva() {
        return valorReserva;
    }

    public void setValorReserva(Double valorReserva) {
        this.valorReserva = valorReserva;
    }

    public Suite getSuiteReserva() {
        return suiteReserva;
    }

    public void setSuiteReserva (Suite suiteReserva) {
        this.suiteReserva = suiteReserva;
    }

    public int getQtdHospedes() {
        return qtdHospedes;
    }

    public void setQtdHospedes(int qtdHospedes) {
        this.qtdHospedes = qtdHospedes;
    }

    public int getQtdDiarias() {
        return qtdDiarias;
    }

    public void setQtdDiarias(int qtdDiarias) {
        this.qtdDiarias = qtdDiarias;
    }

    public void cadastrarReserva(Suite suiteReserva, ArrayList hospedes, int qtd_pessoas, int qtd_diarias) {
        setSuiteReserva(suiteReserva);
        setHospedes(hospedes);
        setQtdHospedes(qtd_pessoas);
        setQtdDiarias(qtd_diarias);
        double valorTotal = calcularDiaria(suiteReserva.getDiaria());
        setValorReserva(valorTotal);
        System.out.println("Reserva realizada com sucesso!");
    }

    public Double calcularDiaria(double diaria) {
        double valorTotal = getQtdDiarias() * diaria;
        if (getQtdDiarias() >= 7) {
            double desconto = valorTotal - (valorTotal * 10 / 100);
            return desconto;
        } else {
            return valorTotal;
        }
    }

    public int verificaCapacidade(int numHospedes, int capacidadeSuite, ArrayList hospedes) {
        for (Object hospede : hospedes) {
            numHospedes += verificaIdade((Hospede) hospede);
        }
        if (numHospedes > capacidadeSuite) {
            System.out.println("Quantidade de Hospedes Maior que a Capacidade da Suite!");
            System.exit(0);
        }
        return numHospedes;
    }

    public String mostrarReserva() {
        return "\nEXTRATO DA RESERVA\n\nNúmero da Suite: " + suiteReserva.getNumero() + "\nHospede Responsavél: " + hospedes.get(0)
            + "\nCapacidade da Suite: " + getQtdHospedes()+"/"+ suiteReserva.getCapacidade() + "\nDias de reserva: " + getQtdDiarias()
            + "\nValor Total: " + getValorReserva() + "\n";
    }

    public int verificaIdade(Hospede hospede) {
        int idade = hospede.getIdade();
        if (idade <= 2) {
            return -1;
        }
        return 0;
    }
}
