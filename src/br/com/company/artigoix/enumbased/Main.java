package br.com.company.artigoix.enumbased;

public class Main {

    public static void main(String[] args) {

//        avaliaDiaDaSemana("OutroValor");

        avaliaDiaDaSemana(DiaDaSemana.valueOf("DIA QUE NÃO EXISTE"));

        System.out.println(DiaDaSemana.DOMINGO.getNome());

        System.out.println(DiaDaSemana.SEGUNDA.verificaFinalDeSemana());
        System.out.println(DiaDaSemana.SABADO.verificaFinalDeSemana());
    }

    public static void avaliaDiaDaSemana(DiaDaSemana diaDaSemana){
        switch (diaDaSemana){
            case DOMINGO:
                System.out.println("EXECUTANDO REGRGA DE NEGÓCIO DO DOMINGO");
                break;
            case SEGUNDA:
                System.out.println("EXECUTANDO REGRGA DE NEGÓCIO DO SEGUNDA");
                break;
            case TERCA:
                System.out.println("EXECUTANDO REGRGA DE NEGÓCIO DO TERCA");
                break;
            case QUARTA:
                System.out.println("EXECUTANDO REGRGA DE NEGÓCIO DO QUARTA");
                break;
            case QUINTA:
                System.out.println("EXECUTANDO REGRGA DE NEGÓCIO DO QUINTA");
                break;
            case SEXTA:
                System.out.println("EXECUTANDO REGRGA DE NEGÓCIO DO SEXTA");
                break;
            case SABADO:
                System.out.println("EXECUTANDO REGRGA DE NEGÓCIO DO SABADO");
                break;
        }
    }
}
