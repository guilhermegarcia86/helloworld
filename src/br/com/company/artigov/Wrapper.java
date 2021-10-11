package br.com.company.artigov;

public class Wrapper {
    private int numero;
    private Integer numeroWrapper;

    public static void main(String[] args) {
        Wrapper wrapper = new Wrapper();

        System.out.println(wrapper.getNumero());
        System.out.println(wrapper.getNumeroWrapper());
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Integer getNumeroWrapper() {
        return numeroWrapper;
    }

    public void setNumeroWrapper(Integer numeroWrapper) {
        this.numeroWrapper = numeroWrapper;
    }
}
