package com.psii.mapa;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Reserva reserva = new Reserva();

        ArrayList<Hospede> reservaHospedes = new ArrayList<>();
        Suite suite0 = new Suite(101, "Simples", 4, 100.0);
        Suite suite1 = new Suite(102, "Simples", 2, 80.0);
        Suite suite2 = new Suite(201, "Luxo", 2, 180.5);
        Suite suite3 = new Suite(202, "Luxo", 1, 120.0);
        Suite suite4 = new Suite(301, "Simples", 3, 140.0);

        Hospede hospede0 = new Hospede(reservaHospedes.size(), "Gabriel", "Rua dos Alfandeiros 4", 31);
        reservaHospedes.add(hospede0);
        Hospede hospede1 = new Hospede(reservaHospedes.size(), "Helena", "Rua dos Alfandeiros 10", 28);
        reservaHospedes.add(hospede1);
        Hospede hospede2 = new Hospede(reservaHospedes.size(), "Ana", "Rua dos Alfandeiros 10", 13);
        reservaHospedes.add(hospede2);
        Hospede hospede3 = new Hospede(reservaHospedes.size(), "Eloisa", "Rua dos Alfandeiros 10", 2);    
        reservaHospedes.add(hospede3);
        

        int qtdHospedes = reservaHospedes.size();
        int qtdDiarias = 7;

        qtdHospedes = reserva.verificaCapacidade(qtdHospedes, suite0.getCapacidade(), reservaHospedes);

        reserva.cadastrarReserva(suite0, reservaHospedes, qtdHospedes, qtdDiarias);
        System.out.println(reserva.mostrarReserva());
    }
}
