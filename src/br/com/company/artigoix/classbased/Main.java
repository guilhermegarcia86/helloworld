package br.com.company.artigoix.classbased;

public class Main {

    public static void main(String[] args) {

        String diaDaSemana = "JANEIRO";

        avaliaDiaDaSemana(diaDaSemana);
    }

    public static void avaliaDiaDaSemana(String diaDaSemana){
        switch (diaDaSemana){
            case DiaDaSemana.DOMINGO:
                System.out.println("EXECUTANDO REGRA DE NEGÓCIO DO DOMINGO");
                break;
            case DiaDaSemana.SEGUNDA:
                System.out.println("EXECUTANDO REGRA DE NEGÓCIO DA SEGUNDA");
                break;
            case DiaDaSemana.TERCA:
                System.out.println("EXECUTANDO REGRA DE NEGÓCIO DA TERCA");
                break;
            case DiaDaSemana.QUARTA:
                System.out.println("EXECUTANDO REGRA DE NEGÓCIO DA QUARTA");
                break;
            case DiaDaSemana.QUINTA:
                System.out.println("EXECUTANDO REGRA DE NEGÓCIO DA QUINTA");
                break;
            case DiaDaSemana.SEXTA:
                System.out.println("EXECUTANDO REGRA DE NEGÓCIO DA SEXTA");
                break;
            case DiaDaSemana.SABADO:
                System.out.println("EXECUTANDO REGRA DE NEGÓCIO DO SABADO");
                break;
        }
    }
}
