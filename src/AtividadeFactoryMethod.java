import java.util.Scanner;

import fabricas.*;
import products.CamisaProduct;

public class AtividadeFactoryMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        FabricaCreator fabrica = null;
        int op = 0;
        do{
            op = menu(scan);

            switch (op) {
                case 1:
                    fabrica = new Nike();
                    break;
                case 2:
                    fabrica = new Adidas();
                    break;
                case 3:
                    fabrica = new Puma();
                    break;
                case 4:
                    fabrica = new Umbro();
                    break;

                case 5:
                    fabrica = new Kappa();
                    break;
            
                default:
                    System.out.println("Opção inválida! \nDigite Novamente!\n\n");
                    break;
            }

            if(op > 0 && op < 6){
                CamisaProduct pedidoCamisa = fabrica.criarCamisa();
                pedidoCamisa.imprimeDados();
            }

        }while (op != 0);
        System.out.printf("\n\n==> Finalizando o Sistema!\n\n");
    }
 
    public static int menu(Scanner scan){
        System.out.println("\n\n============================ MENU DE CAMISETAS ============================");
        System.out.println("1 - Brasil");
        System.out.println("2 - Flamengo");
        System.out.println("3 - Botafogo");
        System.out.println("4 - Fluminense");
        System.out.println("5 - Vasco");
        System.out.println("0 - sair");
        System.out.printf("Escolha uma das Camisetas abaixo para fazer o pedido: ");
        int op = scan.nextInt();
        System.out.println("===========================================================================\n\n");
        return op;
    }
}
