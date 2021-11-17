package br.com.company.artigoviii;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;

public class Banco implements Financiamento, Pagamento, Auditoria, Log, Logger{

    private String nome;
    private List<Conta> contas;

    public Banco(String nome, List<Conta> contas) {
        this.nome = nome;
        this.contas = contas;
    }

    @Override
    public void audita() {
        Auditoria.super.audita();
        System.out.println("AUDITORIA CUSTOMIZADA");
    }

    @Override
    public boolean pegaEmprestimo(Conta conta) {
        return new Random().nextBoolean();
    }

    @Override
    public BigDecimal liberaEmprestimo(Conta conta, BigDecimal valor) {
        if (this.pegaEmprestimo(conta)) {
            return valor;
        }
        return valor.divide(new BigDecimal(2));
    }

    @Override
    public void realizaTransferencia(Conta origem, Conta destino, BigDecimal valor) {
        BigDecimal valorSacado = origem.saca(valor);
        destino.deposita(valorSacado);
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return List.copyOf(contas);
    }

    @Override
    public void log() {
        Log.super.log();
        Logger.super.log();
    }
}
