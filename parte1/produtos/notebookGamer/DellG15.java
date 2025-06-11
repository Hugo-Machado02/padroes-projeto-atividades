package parte1.produtos.notebookGamer;

import parte1.interfaces.INotebookGamer;

public class DellG15 implements INotebookGamer{
    private String modelo;
    private String so;

    public DellG15() {
        this.modelo = "Dell G15";
        this.so = "Windows";
    }

    @Override
    public void imprimeDescricao() {
        System.out.println("--> Criação: Notebook Gamer "+ this.modelo +" com Sistema Operacional "+ this.so +"\n\n");
    }
}
