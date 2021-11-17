package br.com.company.artigoviii;

import java.math.BigDecimal;

public class PessoaJuridica extends Conta {
    public static final String TIPO_DE_DOCUMENTO = "CNPJ";

    public PessoaJuridica(String nome){
        super();
        this.documento = TIPO_DE_DOCUMENTO;
        this.nome = nome;
    }

    @Override
    public BigDecimal saca(BigDecimal quantidade) {
        System.out.println("VALIDANDO...");
        if(quantidade.compareTo(BigDecimal.ZERO) <= 0){
            System.out.println("VALIDAÇÃO RETORNA ERRO");
            throw new IllegalArgumentException("VALOR DEVE SER MAIOR DO QUE ZERO");
        }
        this.saldo = this.saldo.subtract(quantidade);
        return super.saca(quantidade);
    }

    @Override
    public BigDecimal deposita(BigDecimal quantidade) {
        System.out.println("VALIDANDO...");
        if(quantidade.compareTo(BigDecimal.ZERO) <= 0){
            System.out.println("VALIDAÇÃO RETORNA ERRO");
            throw new IllegalArgumentException("VALOR DEVE SER MAIOR DO QUE ZERO");
        }
        this.saldo = this.saldo.add(quantidade);
        return quantidade;
    }
}
