package br.com.company.artigov;

public class Main {

    public static void main(String[] args) {

        Carro ferrari = new Carro("Ferrari");

        Moto harley = new Moto("Harley");

        Bicicleta caloi = new Bicicleta("Caloi");

        Personagem heroi = new Personagem("Heroi");

        System.out.println(heroi.acelera());
        System.out.println(heroi.acelera(10));
        System.out.println(heroi.acelera(harley));
        System.out.println(heroi.acelera(ferrari));
        System.out.println(heroi.acelera(caloi));
    }
}
