package br.ufpb.dcx.maria.atividades.ruexercicio62;

import java.util.Scanner;
public class Teste3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantas refeições foram servidas hoje?");
        int quantidadeRefeicoes = Integer.parseInt(leitor.nextLine());
        RefeicaoRealizada[] refeicoes = new RefeicaoRealizada[quantidadeRefeicoes];
        for (int k = 0; k < quantidadeRefeicoes; k++) {
            System.out.println("Matrícula do(a) aluno(a) [" + (k + 1) + "]");
            String matricula = leitor.nextLine();
            System.out.println("Qual o tipo de refeição? CAFÉ, ALMOÇO ou JANTAR");
            String tipoRefeicao = leitor.nextLine();
            refeicoes[k] = new RefeicaoRealizada(matricula, tipoRefeicao);
            System.out.printf("%s\n", refeicoes[k].toString());
        }
        for (int a = 0; a < refeicoes.length; a++) {
            if (refeicoes[a].getTipoRefeicao().equalsIgnoreCase("Café")) {
                System.out.println("Sim");
            } else {
                System.out.println("Não");
            }
        }
        int quanTipoRefeicaoAlmoco = 0;
           for (int k = 0; k < refeicoes.length; k++) {
               if (refeicoes[k].getTipoRefeicao().equalsIgnoreCase("Almoço")) {
                    quanTipoRefeicaoAlmoco++;
               }
           }
        System.out.println("Quantidade de almoços: " + quanTipoRefeicaoAlmoco);
    System.out.println("FIM DO PROGRAMA");
            leitor.close();
        }
    }