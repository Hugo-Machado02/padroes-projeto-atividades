import java.util.Scanner;

public class PadraoProxy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int op = 0;

        do{
            System.out.println("========== Selecione um usuário ==========");
            System.out.println("1- Itachi: admin");
            System.out.println("2- Rock Lee: vendas");
            System.out.println("0- Sair");
            System.out.printf("Selecione uma Opção: ");
            op = scan.nextInt();
            System.out.println("==========================================\n\n");

            switch (op) {
                case 1:
                    Relatorio relAprovado = new RelatorioProxy("Itachi", true);
                    relAprovado.imprimirRelatorio();
                    break;
            
                case 2:
                    System.out.println("itachi");
                    Relatorio relReprovado = new RelatorioProxy("Rock Lee", false);
                    relReprovado.imprimirRelatorio();
                    break;
            
                case 0:
                    System.out.println("Usuário não Localizado... Favor, Selecionar Novamente!");
                    break;
            
                default:
                    break;
            }
        }while(op != 0);


        scan.close();
    }
}