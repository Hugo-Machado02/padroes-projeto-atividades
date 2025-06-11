package parte1.factory;

import parte1.interfaces.IFabricaNotebooks;
import parte1.interfaces.INotebookCorporativo;
import parte1.interfaces.INotebookGamer;
import parte1.produtos.notebookCorporativo.TravelMate;
import parte1.produtos.notebookGamer.Nitro5;

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
}
