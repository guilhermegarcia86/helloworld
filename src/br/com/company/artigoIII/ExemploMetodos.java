package br.com.company.artigoIII;

public class ExemploMetodos {

    public void helloWorld(){
        System.out.println("Olá Mundo!");
    }

    public void printHelloWorld(){
        System.out.println("Olá Mundo!");
    }

    public void printHelloWorld(String nome){
        System.out.println("Olá Mundo " + nome + "!");
    }

    public void printHelloWorld(String nome, int idade){
        System.out.println("Olá " + nome + " que tem " + idade + " anos!");
    }

    public int soma(int x, int y){
        return x + y;
    }

    public static void main(String[] args) {
        ExemploMetodos exemploMetodos = new ExemploMetodos();

        exemploMetodos.helloWorld();
    }

}
