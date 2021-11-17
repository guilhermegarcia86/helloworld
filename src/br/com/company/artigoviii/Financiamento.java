package br.com.company.artigoviii;

import java.math.BigDecimal;

public interface Financiamento {

    boolean pegaEmprestimo(Conta conta);

    BigDecimal liberaEmprestimo(Conta conta, BigDecimal valor);
}
