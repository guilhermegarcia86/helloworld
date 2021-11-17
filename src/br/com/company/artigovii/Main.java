package br.com.company.artigovii;


import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Conta conta = new PessoaFisica("Guilherme");
        conta.saca(BigDecimal.ZERO);
    }
}
