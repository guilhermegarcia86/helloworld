package br.com.company.artigoII;

import java.util.Random;

public class ExemploDoWhile {

    public static void main(String[] args) throws InterruptedException {
        int contador = 0;
        do {
            System.out.println("Contador é: " + contador);
            contador++;
        } while (contador < 11);

        System.out.println("Finalizado programa");

        do{
            System.out.println("SOAR ALARME: dim! drim! alarme de relógio");
        }while (despertadorEstaNaSoneca());

        System.out.println("Finalizado programa");

    }

    private static boolean despertadorEstaNaSoneca() throws InterruptedException {
        Thread.sleep(1000);
        return new Random().nextBoolean();
    }
}
