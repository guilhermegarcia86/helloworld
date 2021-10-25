package br.com.company.artigovi;

import java.math.BigDecimal;
import java.util.Objects;

public class Conta {

    private String nome;
    private String documento;

    public BigDecimal deposita(BigDecimal quantidade){
        System.out.println("EXECUTA REGRA DE NEGÓCIO GENERALISTA");
        return BigDecimal.ZERO;
    }

    public BigDecimal saca(BigDecimal quantidade){
        System.out.println("EXECUTA REGRA DE NEGÓCIO GENERALISTA");
        return BigDecimal.ZERO;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return Objects.equals(nome, conta.nome) && Objects.equals(documento, conta.documento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, documento);
    }
}
