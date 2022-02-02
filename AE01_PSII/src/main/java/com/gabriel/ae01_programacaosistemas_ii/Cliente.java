package com.gabriel.ae01_programacaosistemas_ii;

public class Cliente {
 
    private int codigo;
    private String nome;
    private String telefone;
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep; 

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public void cadastrarCliente(int c, String nome, String telefone, String rua, int numero, String bairro, String cidade, String estado, String cep){
         setCodigo(c);
         setNome(nome);
         setCidade(telefone);
         setRua(rua);
         setNumero(numero);
         setBairro(bairro);
         setCidade(cidade);
         setEstado(estado);
         setCep(cep);        
    }
}
