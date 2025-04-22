import views.ProjetoView;
import views.mensagensView;
import controllers.ProjetoController;
import models.ProjetoModel;
import java.util.List;

public class ProjetoMvc {

    public static void main(String[] args) {
        ProjetoView projView = new ProjetoView();
        mensagensView validView = new mensagensView();
        ProjetoController projController = new ProjetoController();
        int op;
        do{
            op = projView.menu();
            switch (op) {
                case 1:
                    String[] valProjeto = projView.cadastroProjeto();
                    int result = projController.validaCadastro(valProjeto[0], valProjeto[1], valProjeto[2]);
                    validView.cadastroProjeto(result);
                    break;
                case 2:
                    List<ProjetoModel> projetos = projController.listaProjetos();
                    projView.exibirProejetos(projetos);
                    break;

                case 0:
                    System.out.println("\n--> Finalizando a aplicação!\n");
                    break;
            
                default:
                    System.out.println("\n--> Opcao invalida! Tente Novamente!");
                    break;
            }
        }while(op != 0);
    }

}