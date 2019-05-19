package com.example.saveanimals;

public class Animals {
    private String TipoAnimal;
    private String Nome;
    private String raca;
    private String cor;
    private String imagemLink;

    public Animals(String tipoAnimal, String nome, String raca , String cor, String imagemLink) {
        TipoAnimal = tipoAnimal;
        Nome = nome;
        this.raca = raca;
        this.cor = cor;
        this.imagemLink = imagemLink;
    }

    public String getTipoAnimal() {
        return TipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        TipoAnimal = tipoAnimal;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getImagemLink() {
        return imagemLink;
    }

    public void setImagemLink(String imagemLink) {
        this.imagemLink = imagemLink;
    }

    @Override
    public String toString() {
        return "Animal : " + getTipoAnimal() + " ; " + getNome() + " ; " + getCor() + " ; " + getRaca();
    }
}
