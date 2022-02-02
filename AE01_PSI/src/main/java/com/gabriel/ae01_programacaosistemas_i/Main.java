package com.gabriel.ae01_programacaosistemas_i;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pi = 3.1415;
        int salvaVidas = 0;
        System.out.println("Digite o valor do raio da area: ");
        int raio = Integer.parseInt(scan.next());

        double area = pi * (raio * raio);

        if (area <= 1000){
            salvaVidas = 1;
        }
        else if (area <= 10000){
            salvaVidas = 2;
        }
        else if (area <= 100000){
            salvaVidas = 3;
        }
        else{
                salvaVidas = 4;
        }

        System.out.println("A Area é de " + String.format("%.2f",area) + " m² e necessitará de " + salvaVidas + " Salva-Vidas");
    }
    
}
