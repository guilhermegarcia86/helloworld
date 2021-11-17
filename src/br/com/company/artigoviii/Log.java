package br.com.company.artigoviii;

public interface Log {

    default void log(){
        System.out.println("REALIZANDO LOG");
    };
}
