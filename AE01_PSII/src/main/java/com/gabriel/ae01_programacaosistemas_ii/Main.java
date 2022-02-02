package com.gabriel.ae01_programacaosistemas_ii;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Produto[] produto = new Produto[]{new Produto(), new Produto(), new Produto()};
        Cliente[] cliente = new Cliente[]{new Cliente(), new Cliente(), new Cliente()};
        Venda venda = new Venda();
        Scanner scan = new Scanner(System.in);
                
        produto[0].cadastrarProduto(0, "Livro de Culinaria", 140.20, 15);
        produto[1].cadastrarProduto(1, "Entendendo Java", 175.50, 10);
        produto[2].cadastrarProduto(2, "Introduçao a POO", 125.90, 22);
        
        cliente[0].cadastrarCliente(0, "Andre Gonçalves", "99985-7765", "Rua Asa Branca", 74, "Pedra Grande", "Jundiai", "São Paulo", "1244898");
        cliente[1].cadastrarCliente(1, "Paula da Silva", "98987-7842", "Rua dos Franceses", 254, "Centro", "Joinville", "Santa Catarina", "8987565");
        cliente[2].cadastrarCliente(2, "Emanula Dias", "99935-6284", "Rua Osvaldo de Cravalho", 145, "Jurerê", "Florianopólis", "Santa Catarina", "89802554");
        
        System.out.println("Deseja realizar uma Venda (S/N)");
        String opcao  = scan.next();
        while (true) {            
           if (opcao.startsWith("S")) {               
               System.out.println("Digite o codigo da Venda : ");
               int cod = scan.nextInt();
               System.out.println("Digite o codigo do Cliente : [0,1,2]");
               int clie = scan.nextInt();
               System.out.println("Digite o codigo do Produto : [0,1,2]");
               int prod = scan.nextInt();
               System.out.println("Digite Valor do desconto : ");
               double desconto = scan.nextDouble();
               venda.realizarVenda(cod, cliente[clie], produto[prod], desconto);
               break;               
            }           
            else if (opcao.startsWith("N")){   
                break;
            }
            else {
                System.out.println("Deseja realizar uma Venda (S/N)");
                opcao  = scan.next();
            }
        }
    }
}
