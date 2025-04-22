package views;

import java.util.List;
import models.ProjetoModel;
import java.util.Scanner;

public class ProjetoView {
    private Scanner scan = new Scanner(System.in);

    public int menu(){
        System.out.println("\n=============================== MENU ===============================");        
        System.out.println("1- Cadastro de Projetos");
        System.out.println("2- Listagem dos Projetos");
        System.out.println("0- Sair do Sistema");
        System.out.println("======================================================================");
        System.out.printf("Digite a Opcao desejada: ");
        int selecao = this.scan.nextInt();
        this.scan.nextLine();
        return selecao;
    }

    public String[] cadastroProjeto(){
        System.out.println("\n======================= CADASTRO DE PROJETOS =======================");
        String[] dadosProjeto = new String[3];
        System.out.printf("\n--> Digite o Titulo do Projeto: ");
        dadosProjeto[0] = this.scan.nextLine();
        System.out.printf("--> Digite a data de Inicio (ex: 01/01/2025): ");
        dadosProjeto[1] = this.scan.nextLine();
        System.out.printf("--> Digite a data de Entrega (ex: 01/01/2025): ");
        dadosProjeto[2] = this.scan.nextLine();
        System.out.println("======================================================================");
        return dadosProjeto;
    }

    public void exibirProejetos(List<ProjetoModel> projetos){
        if(!projetos.isEmpty()){
            System.out.println("\n============================= PROJETOS =============================");
            for(ProjetoModel projeto : projetos){
                System.out.println("--> Titulo: " + projeto.getTitulo() + " || Data de Início: " + projeto.getDataInicio() + " || Data de Entrega: " + projeto.getDataFim());
            }
            System.out.println("====================================================================");
        } else{
            System.out.println("\n--> Nenhum Projeto cadastrado até o momento!");

        }
    }
}
