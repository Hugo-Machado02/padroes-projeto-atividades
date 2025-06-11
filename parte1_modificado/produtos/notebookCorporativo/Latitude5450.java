package parte1_modificado.produtos.notebookCorporativo;

import parte1_modificado.interfaces.INotebookCorporativo;

public class Latitude5450 implements INotebookCorporativo{
    private String modelo;
    private String so;

    public Latitude5450() {
        this.modelo = "Dell Latitude 5450";
        this.so = "Linux";
    }

    @Override
    public void imprimeDescricao() {
        System.out.println("--> Criação: Notebook Corporativo "+ this.modelo +" com Sistema Operacional "+ this.so +"\n\n");
    }
}
