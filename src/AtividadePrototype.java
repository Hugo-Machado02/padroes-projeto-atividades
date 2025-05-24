import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import prototype.ViolaoPrototype;

public class AtividadePrototype {
    public static void main(String[] args) {
        FabricaViolao fabricaViolao = new FabricaViolao();
        Scanner scan = new Scanner(System.in);
        Map<Integer, ViolaoPrototype> violaoPrototipos = fabricaViolao.getVioloesPrototipos();

        int op = 0;
        do{
            System.out.println("============================ Menu ============================");
            System.out.println("1 - Fabricar Violão");
            System.out.println("2 - Ver violoes fabricados");
            System.out.printf("\nSelecione a operação desejada: ");
            op = scan.nextInt();
            System.out.println("==============================================================\n\n");

            switch (op) {
                case 1:
                    System.out.println("======================= Fabricar Violão ======================");

                    for(Map.Entry<Integer, ViolaoPrototype> prototipo : violaoPrototipos.entrySet()){
                        System.out.println(prototipo.getKey() + "- Violão " + prototipo.getValue().getTipo());
                    }
                    System.out.printf("Digite o número referente ao Violão Desejado: ");
                    int chavePrototype = scan.nextInt();

                    if(chavePrototype <= violaoPrototipos.size()){
                        if(fabricaViolao.fabricarViolao(chavePrototype)){
                            System.out.println("\n\n==> Violão Fabricado: " + violaoPrototipos.get(chavePrototype).getTipo());
                            System.out.println("==> Descricao: " + violaoPrototipos.get(chavePrototype).getDescricao());
                        }else{
                            System.out.println("\n\n==> Violão não Fabricado");
                        }
                    }else{
                        System.out.println("\n\n==> O Violão não está na Lista!");
                    }

                    System.out.println("==============================================================\n\n");
                    break;

                case 2:
                    ArrayList<ViolaoPrototype> violoresFabricados = fabricaViolao.getVioloesFabricados();
                    System.out.println("===================== Violões Fabricados =====================");
                    if(violoresFabricados.size() > 0){
                        int contagemFabricacao = 0;
                        for(ViolaoPrototype violao : violoresFabricados){
                            System.out.println(violao.getTipo());
                            contagemFabricacao++;
                        }

                        System.out.println("\nTotal Fabricados: " + contagemFabricacao);
                    }
                    else{
                    }
                    System.out.println("==============================================================\n\n");
                    break;

                case 0:
                    System.out.println("==> Finalizando Sistema!\n\n");
                    break;
            
                default:
                    System.out.println("Opção Inválida! Por favor, escolha novamente uma das opções!");
                    break;
            }
            
        }
        while(op != 0);
    }

}
