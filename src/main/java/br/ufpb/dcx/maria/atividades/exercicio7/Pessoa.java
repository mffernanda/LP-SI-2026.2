package br.ufpb.dcx.maria.atividades.exercicio7;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int Idade){
        this.idade = idade;
    }
    public boolean ehDeMaior(){
        if(this.idade >= 18){
            return true;
        } else{
            return false;
        }
    }
}

