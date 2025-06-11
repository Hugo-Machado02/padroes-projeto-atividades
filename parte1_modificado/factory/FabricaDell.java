package parte1_modificado.factory;

import parte1_modificado.interfaces.IFabricaNotebooks;
import parte1_modificado.interfaces.INotebookCorporativo;
import parte1_modificado.interfaces.INotebookGamer;
import parte1_modificado.interfaces.INotebookUsoGeral;
import parte1_modificado.produtos.notebookCorporativo.Latitude5450;
import parte1_modificado.produtos.notebookGamer.DellG15;
import parte1_modificado.produtos.notebookUsoGeral.Inspiron;

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

    @Override
    public void criaNotebookUsoGeral() {
        INotebookUsoGeral newNotebook = new Inspiron();
        newNotebook.imprimeDescricao();
    }
}
