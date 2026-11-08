package br.ufpb.dcx.maria.atividades.exercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaPessoa {
    public static void main(String [] args){
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        int k = 0;
        int totalpessoas = 5;
        while(k < totalpessoas){
            System.out.println("Digite o nome da pessoa: ");
            String nome = leitor.nextLine();
            System.out.println("Digite a idade da pessoa: ");
            int idade = Integer.parseInt(leitor.nextLine());
            Pessoa pessoa = new Pessoa(nome, idade);
            pessoas.add(pessoa);
            k++;
        }
        for(Pessoa p:pessoas){
            System.out.println("Nome da pessoa: "+ p.getNome()+ " Idade da pessoa: "+ p.getIdade());
        }

        for(Pessoa p:pessoas){
            if(p.ehDeMaior()){
                System.out.println(p.getNome()+ " tem 18 anos/tem mais de 18 anos");
            }else {
                System.out.println(p.getNome()+ " tem menos de 18 anos");
            }
        }
        leitor.nextLine();
    }
}
