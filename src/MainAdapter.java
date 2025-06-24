import java.util.Scanner;

public class MainAdapter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        VehicleStorageAdapter adapterStorage = new VehicleStorageAdapter();

        int op = 0;

        do{
            System.out.println("==================== Menu ====================");
            System.out.println("1- Cadastrar Veiculo");
            System.out.println("0- Sair da Aplicacao");
            System.out.printf("Selecione a Opcao Desejada: ");
            op = scan.nextInt();
            System.out.println("==============================================\n\n");

            switch (op) {
                case 1:
                    System.out.println("============ Cadastro de Veiculos ============");
                    System.out.printf("Digite o ID do Carro: ");
                    int id = scan.nextInt();
                    scan.nextLine();
                    System.out.printf("Digite o Modelo do Carro: ");
                    String model = scan.nextLine();
                    System.out.printf("Digite o Ano do Carro: ");
                    int year = scan.nextInt();
                    System.out.println("==============================================\n\n");

                    Vehicle veiculo = new Vehicle(id, model, year);
                    adapterStorage.saveVehicleData(veiculo);

                    break;

                case 0:
                    System.out.println("Finalizando a Aplicacao!\n\n");
                    break;
            
                default:
                    System.out.println("Opcao invalida! Por favor, selecione novamente");
                    break;
            }


        }while(op != 0);
        scan.close();
    }
}