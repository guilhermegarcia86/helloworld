package br.com.company.artigoviii;

import java.math.BigDecimal;

public interface Pagamento {

    void realizaTransferencia(Conta origem, Conta destino, BigDecimal valor);
}
