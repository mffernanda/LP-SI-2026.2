package dcx.ufpb.atividades;
import java.util.Scanner;

public class Beecrowd1074 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int N = Integer.parseInt(leitor.nextLine());
        if(N%2 == 0){
            System.out.println("EVEN");
        }
        if(N%2 == 1){
            System.out.println("ODD");
        }
        if(N < 0){
            System.out.println("NEGATIVE");
        }
        if(N > 0){
            System.out.println("POSITIVE");
        }
        if(N == 0) {
            System.out.println("NULL");
        }
    }
}a
