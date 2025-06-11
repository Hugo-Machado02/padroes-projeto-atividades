package parte2_modificado;

import java.util.Scanner;

import parte2_modificado.factory.FabricaToyota;
import parte2_modificado.factory.FabricaVolkswagen;
import parte2_modificado.interfaces.IFabricaCarros;
import parte2_modificado.factory.FabricaFiat;

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
                    IFabricaCarros fabricaVolkswagen = new FabricaVolkswagen();
                    int modeloVolkswagen = menuModelo(scan);
                    criacaoCarro(fabricaVolkswagen, modeloVolkswagen);
                    break;

                case 2:
                    IFabricaCarros fabricaToyota = new FabricaToyota();
                    int modeloToyota = menuModelo(scan);
                    criacaoCarro(fabricaToyota, modeloToyota);
                    break;

                case 3:
                    IFabricaCarros fabricaFiat = new FabricaFiat();
                    int modeloFiat = menuModelo(scan);
                    criacaoCarro(fabricaFiat, modeloFiat);
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
        System.out.println("1- Fabrica Volkswagen");
        System.out.println("2- Fabrica Toyota");
        System.out.println("3- Fabrica Fiat");
        System.out.println("0- Encerrar o sistema");
        System.out.printf("Selecione uma Opção: ");
        int op = scan.nextInt();
        System.out.println("=============================================================\n\n");
        return op;
    }

    public static int menuModelo(Scanner scan){
        int op = 0;
        do{
            System.out.println("======================== MENU CARROS ========================");
            System.out.println("1- Carro Esportivo");
            System.out.println("2- Carro Popular");
            System.out.println("0- Voltar ao menu anterior");
            System.out.printf("Selecione uma Opção: ");
            op = scan.nextInt();
            System.out.println("============================================================\n\n");

            if(op > 2 || op < 0){
                System.out.println("--> Opção inválida! Digite novamente!\n\n");
            }else{
                break;
            }
        } while(true);
        return op;
    }
    
    public static void criacaoCarro(IFabricaCarros fabrica, int escolha){
        if(escolha == 1){
            fabrica.criaCarroEsportivo();
        }
        if(escolha == 2){
            fabrica.criaCarroPopular();
        }
        if(escolha == 0){
            System.out.println("--> Voltando ao menu anterior!");
        }
    }
}