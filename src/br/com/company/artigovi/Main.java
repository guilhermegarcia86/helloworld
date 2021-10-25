package br.com.company.artigovi;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        PessoaFisica contaPessoaFisica = new PessoaFisica();
        contaPessoaFisica.deposita(BigDecimal.valueOf(10));

        PessoaJuridica contaPessoaJuridica = new PessoaJuridica();
        contaPessoaJuridica.saca(BigDecimal.valueOf(10));

    }
}
