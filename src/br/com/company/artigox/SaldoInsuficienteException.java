package br.com.company.artigox;

public class SaldoInsuficienteException extends RuntimeException{

    public SaldoInsuficienteException(String msg){
        super(msg);
    }
}
