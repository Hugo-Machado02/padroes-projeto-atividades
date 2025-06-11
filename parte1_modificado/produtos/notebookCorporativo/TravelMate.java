package parte1_modificado.produtos.notebookCorporativo;

import parte1_modificado.interfaces.INotebookCorporativo;

public class TravelMate implements INotebookCorporativo{
    private String modelo;
    private String so;

    public TravelMate(){
        this.modelo = "Acer - TravelMate";
        this.so = "linux";
    }

    @Override
    public void imprimeDescricao() {
        System.out.println("--> Criação: Notebook Corporativo "+ this.modelo +" com Sistema Operacional "+ this.so +"\n\n");
    }
}
