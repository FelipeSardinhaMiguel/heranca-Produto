package br.com.etechas.models;

public class Cd extends Produtos{
    private String artista;
    private String gravadora;
    private String paisOrigem;

    @Override
    public String listarProduto()
    {
        return super.descricao;

    }

    public void calcularPrecoVenda()
    {
        precoCusto += precoCusto * 0.15;
    }


    //getters & setters
    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }
}