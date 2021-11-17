package br.com.company.artigoviii;

public interface Auditoria {

    default void audita(){
        System.out.println("REALIZANDO AUDITORIA");
    };
}
