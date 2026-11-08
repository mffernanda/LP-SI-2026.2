package br.ufpb.dcx.maria.atividades.exercicio7;

import java.util.ArrayList;

public class TestaBanco {
    public static void main(String [] args) {
        BancoList meuBanco = new BancoList("Ayla's Bank","123/321",new ArrayList<Conta>());
        meuBanco.abrirConta("111.111.111-11", "222-2", "333-3",100);
        System.out.println(meuBanco.consultarSaldoDeConta("222-2", "333-3")); //... ...
        meuBanco.abrirConta("222.222.222-22", "555-55","777-77",1000);
        meuBanco.transferir("222-2", "333-3","555-5","777-", 100);
        System.out.println(meuBanco.consultarSaldoDeConta("555-5","777-2"));
        ArrayList<Conta> contasNegativas = meuBanco.pesquisarContasComSaldoNegativo();
        for(Conta c: contasNegativas){
            System.out.println((c.toString()));
        }
    }
}
