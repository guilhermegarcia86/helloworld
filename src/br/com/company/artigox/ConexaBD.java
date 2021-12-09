package br.com.company.artigox;

import java.sql.SQLException;

public class ConexaBD implements AutoCloseable{

    public void conectaBanco() throws SQLException {
        System.out.println("Conectando...");
        throw new SQLException("Erro na conexão");
    }

    @Override
    public void close() throws SQLException {
        System.out.println("Fechando conexão");
    }
}
