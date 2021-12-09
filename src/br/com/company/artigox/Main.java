package br.com.company.artigox;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        try (ConexaBD conexaBD = new ConexaBD()) {
            conexaBD.conectaBanco();
        } catch (SQLException e) {
            System.out.println("Problema na conexão com o banco de dados: %s - %s".formatted(e.getClass().getName(), e.getMessage()));
        }

    }

    public static void conectaBancoDeDados() throws SQLException {

        try{
            System.out.println("Conectando...");
            throw new SQLException("Problemas na conexão");
        }finally {
            System.out.println("Fechando conexão com o banco");
        }

    }
}
