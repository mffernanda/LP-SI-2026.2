import java.util.Scanner;

public class Atividade {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = leitor.nextLine();
        System.out.println("Em que cidade você nasceu?");
        String cidade = leitor.nextLine();
        System.out.println("Oi,"+ nome +"! Que legal saber que você é da cidade de "+ cidade);

        leitor.close();
    }
}
