package br.com.company.artigoII;


import java.time.LocalDate;
import java.time.Period;

public class ExemploIfElse {

    public static void main(String[] args) {

        LocalDate dataNascimento = LocalDate.of(1986, 03, 25);

        var dataHoje = LocalDate.now();

        Period period = Period.between(dataNascimento, dataHoje);

        if(period.getYears() > 18){
            System.out.println("É maior de idade");
        }else{
            System.out.println("Não é maior de idade");
        }

        if(period.getYears() > 40)
            System.out.println("Executa lógica do if");
            System.out.println("Só pode executar se for maior de 40");

        System.out.println("Fim da execução");



    }

}
