package br.ufpb.dcx.maria.atividades.ruexercicio62;
import java.util.Scanner;

public class RUalmoco {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos almoços foram servidos hoje?");
        int n = Integer.parseInt(leitor.nextLine());
        double total = 0.0;
        for (int k = 0; k < n; k++) {
            System.out.println("Digite o preço do almoço: " + (k + 1));
            double AlmocoPreco = Double.parseDouble(leitor.nextLine());
            total += total + AlmocoPreco;
        }
        System.out.println("Valor total do alomoço: "+ total);
        leitor.close();
    }
}