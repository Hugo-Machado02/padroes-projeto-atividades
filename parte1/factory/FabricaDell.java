package parte1.factory;

import parte1.interfaces.IFabricaNotebooks;
import parte1.interfaces.INotebookCorporativo;
import parte1.interfaces.INotebookGamer;
import parte1.produtos.notebookCorporativo.Latitude5450;
import parte1.produtos.notebookGamer.DellG15;

public class FabricaDell implements IFabricaNotebooks{
    @Override
    public void criaNotebookCorporativo() {
        INotebookCorporativo newNotebook = new Latitude5450();
        newNotebook.imprimeDescricao();
    }

    @Override
    public void criaNotebookGamer() {
        INotebookGamer newNotebook = new DellG15();
        newNotebook.imprimeDescricao();
    }
}
