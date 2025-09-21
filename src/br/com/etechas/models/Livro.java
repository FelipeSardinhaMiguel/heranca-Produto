package br.com.etechas.models;

public class Livro extends Produtos {

    private String autor;
    private String editora;
    private String edicao;

    @Override
    public String listarProduto()
    {
        return super.descricao;
    }

    /*@Override
    public String toString() {
        return "Livro{" +
                "autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", edicao='" + edicao + '\'' +
                '}';
    }*/

    //getters & setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
}