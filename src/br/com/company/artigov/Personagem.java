package br.com.company.artigov;

public class Personagem {

    private String nome;

    public Personagem(String nome) {
        this.nome = nome;
    }

    public String acelera(Bicicleta bicicleta){
        return "Acelerando com o bicicleta: " + bicicleta.getNome();
    }

    public String acelera(Moto moto){
        return "Acelerando com o moto: " + moto.getNome();
    }

    public String acelera(Carro carro){
        return "Acelerando com o carro: " + carro.getNome();
    }

    public String acelera(){
        return "Acelerando a pé";
    }

    public int acelera(int kmH){
        return kmH;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
