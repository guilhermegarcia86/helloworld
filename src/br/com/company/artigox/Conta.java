package br.com.company.artigox;

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

    public BigDecimal saca(BigDecimal quantidade) {
        System.out.println("EXECUTA REGRA DE NEGÓCIO GENERALISTA");
        return quantidade;
    }

    public void transfere(Conta de, Conta para, BigDecimal quantidade) throws Exception {

        BigDecimal valor;

        try {
            valor = de.saca(quantidade);
            System.out.println("Valor da transferência %s".formatted(valor));
        } catch (SaldoInsuficienteException e) {
            //Libera limite especial para transferencias
            System.out.println("Executando código para se recuperar da Exception");
            valor = quantidade;
        }

        para.deposita(valor);
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public BigDecimal getSaldo() {
        return saldo;
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
