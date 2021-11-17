package br.com.company.artigoviii;

public interface Logger {

    default void log(){
        System.out.println("REALIZANDO LOGGER");
    };
}
