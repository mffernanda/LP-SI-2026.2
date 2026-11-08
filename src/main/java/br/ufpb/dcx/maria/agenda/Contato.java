package br.ufpb.dcx.maria.agenda;

public class Contato {
    private String nome;
    private Endereco endereco;
    private String cpf;

    public Contato(String nome, Endereco endereco, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    public Contato() {
        this("", new Endereco(),"");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String toString() {
        return "Nome do Contato: "+this.nome +
                " Endereço do Contato: " +this.endereco +
                "Cpf do Contato: "+ this.cpf.toString();
    }
}