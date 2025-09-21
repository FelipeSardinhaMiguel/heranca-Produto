package br.com.etechas.models;

public class Dvd extends Produtos{
    private String diretor;
    private String duracao;
    private String censura;

    @Override
    public String listarProduto()
    {
        return super.descricao;
    }

    public void calcularPrecoVenda(double cotacaoDolar)
    {
        precoVenda = precoVenda * cotacaoDolar;
    }


    //getters & setters
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getCensura() {
        return censura;
    }

    public void setCensura(String censura) {
        this.censura = censura;
    }
}