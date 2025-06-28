import java.util.Scanner;

public class MainChainOfResponsability {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int op = 0;
        Handler validaHandler = new LoginCadastroHandler();
        validaHandler
            .setProximo(new MaiusculaHandler())
            .setProximo(new MinusculaHandler())
            .setProximo(new CaractereEspecialHandler())
            .setProximo(new NumeroHander())
            .setProximo(new SequenciaNumericaHandler())
            .setProximo(new TamanhoMinimoHandler())
            .setProximo(new TamanhoMaximoHandler());

        do{
            System.out.println("===================== MENU =====================");
            System.out.println("1- Acessar Sistema");
            System.out.println("0- Sair");
            System.out.printf("Selecione a Opcao: ");
            op = scan.nextInt();
            System.out.println("================================================\n\n");
            scan.nextLine();

            switch (op) {
                case 1:
                    System.out.println("===================== LOGIN ====================");
                    System.out.printf("Digite o usuário: ");
                    String usuario = scan.nextLine();
                    System.out.printf("Digite a Senha: ");
                    String senha = scan.nextLine();
                    System.out.println("================================================\n\n");

                    boolean resultado = validaHandler.valida(new Login(usuario, senha));
                    if (resultado) {
                        System.out.println("--> Login e senha válidos. Acesso permitido!");
                        op = 0;
                    } else {
                        System.out.println("--> Credenciais inválidas.\n\n");
                    }
                    break;

                case 0:
                    System.out.println("--> Finalizando o Sistema!\n\n");
                    break;
            
                default:
                    System.out.println("--> Opção inválida! Selecione novamente\n\n");
                    break;
            }
        }while(op != 0);
        

        

        scan.close();
    }
}