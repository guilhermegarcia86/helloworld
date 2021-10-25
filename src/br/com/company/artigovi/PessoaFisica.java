package br.com.company.artigovi;

import java.math.BigDecimal;

public class PessoaFisica extends Conta{

    public static final String TIPO_DE_DOCUMENTO = "CPF";

    @Override
    public BigDecimal saca(BigDecimal quantidade) {
        System.out.println("APLICANDO REGRA MUITO ESPECÍFICA SEM CHAMAR A SUPER CLASSE");
        return quantidade;
    }

    @Override
    public BigDecimal deposita(BigDecimal quantidade) {
        System.out.println("APLICANDO REGRA MUITO ESPECÍFICA SEM CHAMAR A SUPER CLASSE");
        return quantidade;
    }
}
