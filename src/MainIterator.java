import java.util.Scanner;

public class MainIterator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ListGames collection = new ListGames();
        GameIterator iterator = collection.criaIterator();
        int op = 0;

        do{
            System.out.println("========================== Menu ==========================");
            System.out.println("Deseja Cadastrar um novo jogo? (Sim: 1 | Nao: 2)");
            System.out.printf("Selecione a Opcao Desejada: ");
            op = scan.nextInt();
            System.out.println("==========================================================\n\n");
            scan.nextLine();

            switch (op) {
                case 1:
                    System.out.println("==================== Cadastro de Games ===================");
                    System.out.printf("Digite o nome do jogo: ");
                    String nome = scan.nextLine();
                    System.out.println("==========================================================\n\n");
                    collection.addGame(new Game(nome));
                    break;
                case 2:
                    System.out.println("========================== Games =========================");
                    while (iterator.temProximo()) {
                        Game game = iterator.proximo();
                        System.out.println("- " + game.getNome());
                    }
                    System.out.println("==========================================================\n\n");
                    break;
            
                default:
                    System.out.println("Opcao invalida! Digite novamente\n\n");
                    break;
            }
        }while(op != 2);
        scan.close();
    }
}