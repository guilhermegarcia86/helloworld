package br.com.company.artigoiv;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Guilherme", "Alves", 35, "São Paulo", "Desenvolvimento");
        Funcionario funcionarioII = new Funcionario("Guilherme", "Alves", 35, "São Paulo", "Desenvolvimento");
        System.out.println(funcionario.equals(funcionarioII));
        System.out.println(funcionario.toString());
        System.out.println(funcionarioII.toString());

        Funcionario funcionarioIII = new Funcionario();
        funcionarioIII.setNome(null);
        System.out.println(funcionarioIII.getNome());
        funcionarioIII.setNome("Guilherme");
        System.out.println(funcionarioIII.getNome());

        System.out.println("O tipo de documento de todo funcionario é o " + Funcionario.TIPO_DOCUMENTO);

        System.out.println(Funcionario.imprimeTipoDeDocumentoDosFuncionarios());
    }
}
