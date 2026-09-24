package dcx.ufpb.atividades;
import java.util.Scanner;

public class Beecrowd1009 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        String nome = leitor.nextLine();
        double salariofixo = Double.parseDouble(leitor.nextLine());
        double vendas = Double.parseDouble(leitor.nextLine());
        double total = salariofixo + 0.15 * vendas;
        System.out.printf("TOTAL = R$ %.2f", total);
    }
}
