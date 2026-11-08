package br.ufpb.dcx.maria.atividades.exercicio61;

import java.util.Scanner;

public class ProgramaDescontos {
    public static double calculaValorComDesconto(double valorProduto) {
        if (valorProduto < 50) {
            return (valorProduto);
        } else if (valorProduto < 100) {
            return (valorProduto - (valorProduto * 0.05));
        } else {
            return (valorProduto - (valorProduto * 0.10));
        }
    }

    public static double calculaSomatorioDescontos(Produto[] precos) {
        double soma = 0;
        for (int k = 0; k < precos.length; k++) {
            soma += precos[k].getPreco();
        }
        return soma;
    }

    public static double verificaProdutoComMaiorDesconto(Produto[] precos) {
        double maiordesconto = precos[0].getPreco();
        Produto maiorproduto = precos[0];
        for (int k = 0; k < precos.length; k++) {
            if (precos[k].getPreco() > maiordesconto) {
                maiordesconto = precos[k].getPreco();
                maiorproduto = precos[k];
            }
        }
        return maiordesconto;
    }

    public static void main(Double[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos produtos você quer comprar?");
        int quant = Integer.parseInt(leitor.nextLine());
        Produto[] produtos = new Produto[quant];
        for (int k = 0; k < quant; k++) {
            Produto p = new Produto();
            System.out.println("Qual o nome do produto?");
            p.setNome(leitor.nextLine());
            System.out.println("Qual o preço original do produto?");
            p.setPreco(Double.parseDouble(leitor.nextLine()));
            double valorComDesconto = ProgramaDescontos.calculaValorComDesconto(p.getPreco());
            System.out.printf("O valor a pagar pelo produto é R$ %.2f\n", valorComDesconto);
            produtos[k] = p;
        }
        leitor.close();
    }
}
