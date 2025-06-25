import java.util.Scanner;

public class MainComposite {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int op = 0;

        do{
            System.out.println("==================== Loja de Quadrinhos ====================");
            System.out.println("1- Cliente Platina");
            System.out.println("2- Cliente Ouro");
            System.out.println("3- Cliente Prata");
            System.out.println("4- Cliente Bronze");
            System.out.println("0- Sair");
            System.out.printf("Selecione o tipo do Cliente: ");
            op = scan.nextInt();
            System.out.println("==============================================\n\n");

            switch (op) {
                case 1:
                    instanciaCaixa("Platina");
                    break;
                case 2:
                    instanciaCaixa("Ouro");
                    break;
                case 3:
                    instanciaCaixa("Prata");
                    break;
                case 4:
                    instanciaCaixa("Bronze");
                    break;

                case 0:
                    System.out.println("Finalizando a Aplicacao!\n\n");
                    break;
            
                default:
                    System.out.println("--> Opcao invalida! Por favor, selecione novamente\n\n");
                    break;
            }
        }while(op != 0);
        scan.close();
    }

    public static void instanciaCaixa(String tipoCliente){
        ItemComponent caixa = new CaixaComposite(tipoCliente);
        caixa.exibirDetalhes();
    }
}
