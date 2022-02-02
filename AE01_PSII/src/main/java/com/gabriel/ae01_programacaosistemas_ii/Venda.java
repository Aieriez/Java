package com.gabriel.ae01_programacaosistemas_ii;

public class Venda {
    private int codigo;
    private String vendaCliente;
    private String vendaProduto;
    private double valorVenda;
    private double valorFinal;
    
    Produto produto = new Produto();
    Cliente cliente = new Cliente();
        
    public String getVendaCliente() {
        return vendaCliente;
    }

    public void setVendaCliente(String vendaCliente) {
        this.vendaCliente = vendaCliente;
    }

    public String getVendaProduto() {
        return vendaProduto;
    }

    public void setVendaProduto(String vendaProduto) {
        this.vendaProduto = vendaProduto;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
           
    public double desconto (double v, double d){
        double desc = v * (d/100);
        double valorF = v - desc;
        return valorF;
    }
    
    public void realizarVenda(int codigo, Cliente cliente, Produto produto, double desc){
                setCodigo(codigo);
                setVendaCliente(cliente.getNome());
                setVendaProduto(produto.getDescricao());
                setValorVenda(produto.getPreco());
                setValorFinal(desconto(produto.getPreco(), desc));
                System.out.println("Venda Concluída com Sucesso\n---------------------------------------------");
                imprimirFatura(vendaCliente, vendaProduto, produto.getPreco(), getValorFinal());
                System.out.println("\n---------------------------------------------");
                produto.setQtdEstoque(produto.getQtdEstoque() - 1);
    }
    
    public void imprimirFatura(String clienteNome, String produtoDesc ,double preco, double  valorFinal){
        System.out.println("Resumo da Venda\n" + "Cliente: " + clienteNome + "\nProduto: " + produtoDesc); 
        System.out.printf("Valor Sem desconto: " + "%.2f", preco);
        System.out.printf("\nValor Com desconto"  + ": %.2f", valorFinal);
    }
      
}
