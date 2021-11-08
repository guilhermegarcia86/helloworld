package br.com.company.aritogvii;

import java.math.BigDecimal;

public class PessoaJuridica extends Conta{
    public static final String TIPO_DE_DOCUMENTO = "CNPJ";

    @Override
    public BigDecimal saca(BigDecimal quantidade) {
        System.out.println("VALIDANDO...");
        if(quantidade.compareTo(BigDecimal.ZERO) <= 0){
            System.out.println("VALIDAÇÃO RETORNA ERRO");
            throw new IllegalArgumentException("VALOR DEVE SER MAIOR DO QUE ZERO");
        }
        return super.saca(quantidade);
    }

    @Override
    public BigDecimal deposita(BigDecimal quantidade) {
        System.out.println("VALIDANDO...");
        if(quantidade.compareTo(BigDecimal.ZERO) <= 0){
            System.out.println("VALIDAÇÃO RETORNA ERRO");
            throw new IllegalArgumentException("VALOR DEVE SER MAIOR DO QUE ZERO");
        }
        return BigDecimal.ZERO;
    }
}
