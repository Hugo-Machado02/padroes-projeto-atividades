package parte1_modificado;

import java.util.Scanner;

import parte1_modificado.factory.FabricaAcer;
import parte1_modificado.factory.FabricaDell;
import parte1_modificado.interfaces.IFabricaNotebooks;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fabrica = 0;
        do{
            fabrica = menuFabrica(scan);
            switch (fabrica) {
                case 0:
                    System.out.println("--> Sair do Sistema");
                    break;

                case 1:
                    IFabricaNotebooks fabricaDell = new FabricaDell();
                    int modeloDell = menuModelo(scan);
                    criacaoNotebook(fabricaDell, modeloDell);
                    break;

                case 2:
                    IFabricaNotebooks fabricaAcer = new FabricaAcer();
                    int modeloAcer = menuModelo(scan);
                    criacaoNotebook(fabricaAcer, modeloAcer);
                    break;
            
                default:
                    System.out.println("--> Opção inválida! Digite novamente!\n\n");
                    break;
            }
        }while (fabrica != 0);
        System.out.println("--> Sistema Finalizado");
    }

    public static int menuFabrica(Scanner scan){
        System.out.println("\n\n======================= MENU FABRICAS =======================");
        System.out.println("1- Fabrica de Notebooks Dell");
        System.out.println("2- Fabrica de Notebooks Acer");
        System.out.println("0- Encerrar o sistema");
        System.out.printf("Selecione uma Opção: ");
        int op = scan.nextInt();
        System.out.println("=============================================================\n\n");
        return op;
    }

    public static int menuModelo(Scanner scan){
        int op = 0;
        do{
            System.out.println("======================= MENU MODELOS =======================");
            System.out.println("1- Notebook Gamer");
            System.out.println("2- Notebook Corporativo");
            System.out.println("2- Notebook Uso Geral1");
            System.out.println("0- Voltar ao menu anterior");
            System.out.printf("Selecione uma Opção: ");
            op = scan.nextInt();
            System.out.println("============================================================\n\n");

            if(op > 3 || op < 0){
                System.out.println("--> Opção inválida! Digite novamente!\n\n");
            }else{
                break;
            }
        } while(true);
        return op;
    }
    
    public static void criacaoNotebook(IFabricaNotebooks fabrica, int escolha){
        if(escolha == 1){
            fabrica.criaNotebookGamer();
        }
        if(escolha == 2){
            fabrica.criaNotebookCorporativo();
        }
        if(escolha == 3){
            fabrica.criaNotebookUsoGeral();
        }
        if(escolha == 0){
            System.out.println("--> Voltando ao menu anterior!");
        }
    }
}
