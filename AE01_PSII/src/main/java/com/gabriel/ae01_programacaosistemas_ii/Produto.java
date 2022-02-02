package com.gabriel.ae01_programacaosistemas_ii;

public class Produto {
    
    private int prodCodigo;
    private String descricao;
    private double preco;
    private int qtdEstoque;

    public int getProdCodigo() {
        return prodCodigo;
    }

    public void setProdCodigo(int prodCodigo) {
        this.prodCodigo = prodCodigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
    
    public void cadastrarProduto (int prodCodigo, String descricao, double preco, int qtdEstoque){
        setProdCodigo(prodCodigo);
        setDescricao(descricao);
        setPreco(preco);
        setQtdEstoque(qtdEstoque);
    }
        
}
