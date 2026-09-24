package dcx.ufpb.atividades;
import java.util.Scanner;

public class Beecrowd1006 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        double A = Double.parseDouble(leitor.nextLine());
        double B = Double.parseDouble(leitor.nextLine());
        double C = Double.parseDouble(leitor.nextLine());
        double media2 = (2*A  + 3*B + 5*C) /(2+3+5);
        System.out.printf("MEDIA = %.1f\n", media2);
        leitor.close();
    }
}
