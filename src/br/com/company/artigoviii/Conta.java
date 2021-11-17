package br.com.company.artigoviii;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Conta {

    protected String nome;
    protected String documento;
    protected  BigDecimal saldo;

    public Conta() {
        this.saldo = new BigDecimal("1000");
    }

    public abstract BigDecimal deposita(BigDecimal quantidade);

    public BigDecimal saca(BigDecimal quantidade){
        System.out.println("EXECUTA REGRA DE NEGÓCIO GENERALISTA");
        return quantidade;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", saldo=" + saldo +
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
