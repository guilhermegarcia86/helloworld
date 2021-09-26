package br.com.company.artigoIII;

public class ExemploEscopo {

    int idade = 0;

    public void mostraIdade(int idade){
        System.out.println("A idade é " + idade);
    }

    public void mostraIdadeII(){
        System.out.println("A idade é " + idade);
    }

    public void metodoEscopoIf(){

        if(true){
            int valor = 0;
        }

       // System.out.println("O valor é " + valor);
    }

    public void exibirSequencia(int numero) {

        if (numero == 0) {
            return;
        }

        System.out.println(numero);

        exibirSequencia(--numero);
    }

    public static void main(String[] args) {
        ExemploEscopo exemploEscopo = new ExemploEscopo();

        //exemploEscopo.mostraIdade(20);

      //  System.out.println(idade);

        for (int indice = 0; indice <= 10; indice++){
          //  System.out.println("O valor do indice é " + indice);
        }

       // System.out.println(indice);

        exemploEscopo.exibirSequencia(10);

    }
}
