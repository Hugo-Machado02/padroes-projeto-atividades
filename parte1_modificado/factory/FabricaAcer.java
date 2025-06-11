package parte1_modificado.factory;

import parte1_modificado.interfaces.IFabricaNotebooks;
import parte1_modificado.interfaces.INotebookCorporativo;
import parte1_modificado.interfaces.INotebookGamer;
import parte1_modificado.interfaces.INotebookUsoGeral;
import parte1_modificado.produtos.notebookCorporativo.TravelMate;
import parte1_modificado.produtos.notebookGamer.Nitro5;
import parte1_modificado.produtos.notebookUsoGeral.Aspire;

public class FabricaAcer implements IFabricaNotebooks{
    @Override
    public void criaNotebookCorporativo() {
        INotebookCorporativo newNotebook = new TravelMate();
        newNotebook.imprimeDescricao();
    }

    @Override
    public void criaNotebookGamer() {
        INotebookGamer newNotebook = new Nitro5();
        newNotebook.imprimeDescricao();
    }

    @Override
    public void criaNotebookUsoGeral() {
        INotebookUsoGeral newNotebook = new Aspire();
        newNotebook.imprimeDescricao();
    }
}
