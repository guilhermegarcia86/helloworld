package br.com.company.artigoviii;


import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Conta contaFisicaGuilherme = new PessoaFisica("Guilherme");
        Conta contaJuridicaGuilherme = new PessoaJuridica("Empresa do Guilherme");

        Banco banco = new Banco("MeuBano", List.of(contaFisicaGuilherme, contaFisicaGuilherme));
        banco.audita();

        banco.realizaTransferencia(contaFisicaGuilherme, contaJuridicaGuilherme, new BigDecimal("10"));

        System.out.println(contaFisicaGuilherme);
        System.out.println(contaJuridicaGuilherme);


        List<String> lista = new ArrayList<>();
        lista = new LinkedList<>();
        lista = new Vector<>();
        lista = new Stack<>();
    }
}
