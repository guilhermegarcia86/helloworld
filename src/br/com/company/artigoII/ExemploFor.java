package br.com.company.artigoII;

import java.util.ArrayList;
import java.util.List;

public class ExemploFor {

    public static void main(String[] args) {
//        for (int i = 0; i <= 10; i++){
//            System.out.println(i);
//        }

        var lista = List.of("Arroz", "Feijão", "Macarrão", "Óleo");

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        for (String l : lista){
            System.out.println(l);
        }
    }
}
