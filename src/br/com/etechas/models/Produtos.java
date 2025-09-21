//Feito pelos alunos: Felipe e Gustavo

package br.com.etechas.models;

public abstract class Produtos {
    protected String descricao;
    protected String genero;
    protected int estoqueDisponivel;
    protected double precoCusto;
    protected double precoVenda;


    public void comprar(int qtde)
    {

    }

    public void vender(int qtde)
    {
        //precoVenda = qtde * calcularPrecoVenda(precoCusto);
    }

    public abstract String listarProduto();

    public void calcularPrecoVenda()
    {
        precoCusto += precoCusto * 0.1;
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "descricao='" + descricao + '\'' +
                ", genero='" + genero + '\'' +
                ", estoqueDisponivel=" + estoqueDisponivel +
                ", precoCusto=" + precoCusto +
                ", precoVenda=" + precoVenda +
                '}';
    }

    //getters & setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEstoqueDisponivel() {
        return estoqueDisponivel;
    }

    public void setEstoqueDisponivel(int estoqueDisponivel) {
        this.estoqueDisponivel = estoqueDisponivel;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
}