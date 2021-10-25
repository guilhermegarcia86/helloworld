package br.com.company.artigovi;

import java.math.BigDecimal;

public class ContaPessoaJuridica {

    private String nome;
    private String documento;

    public BigDecimal deposita(BigDecimal quantidade){
        System.out.println("EXECUTA REGRA DE NEGÓCIO ESPECÍFICO PARA CONTA JURIDICA");
        return BigDecimal.ZERO;
    }

    public BigDecimal saca(BigDecimal quantidade){
        System.out.println("EXECUTA REGRA DE NEGÓCIO ESPECÍFICO PARA CONTA JURIDICA");
        return BigDecimal.ZERO;
    }
}
