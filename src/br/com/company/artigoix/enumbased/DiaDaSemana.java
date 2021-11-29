package br.com.company.artigoix.enumbased;

public enum DiaDaSemana {
    DOMINGO("Domingo"),
    SEGUNDA("Segunda"),
    TERCA("Terça"),
    QUARTA("Quarta"),
    QUINTA("Quinta"),
    SEXTA("Sexta"),
    SABADO("Sábado");

    private String nome;

    DiaDaSemana(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public boolean verificaFinalDeSemana(){
        if(this == SABADO || this == DOMINGO){
            return true;
        }

        return false;
    }
}
