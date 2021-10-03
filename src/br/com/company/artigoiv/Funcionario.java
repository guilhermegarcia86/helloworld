package br.com.company.artigoiv;

public class Funcionario {

    public static final String TIPO_DOCUMENTO = "CPF";

    public static String imprimeTipoDeDocumentoDosFuncionarios(){
        return "O tipo de documento de todo funcionario é o " + Funcionario.TIPO_DOCUMENTO;
    }

    private String nome;
    private String sobrenome;
    private int idade;
    private String endereco;
    private String departamento;

    public Funcionario() {
    }

    public Funcionario(String nome, String sobrenome, int idade, String endereco, String departamento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.endereco = endereco;
        this.departamento = departamento;
    }

    public String nomeCompleto(){
        return this.nome + " " + this.sobrenome;
    }

    public String getNome() {
        if(nome == null || nome.isEmpty() || nome.isBlank()){
            System.out.println("Valor do nome não foi preenchido");
            return "";
        }
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.isEmpty() || nome.isBlank()){
            System.out.println("Valor deve ser preenchido");
            return;
        }
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
