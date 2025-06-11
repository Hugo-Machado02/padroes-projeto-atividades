package parte1_modificado.produtos.notebookGamer;

import parte1_modificado.interfaces.INotebookGamer;

public class Nitro5 implements INotebookGamer{
    private String modelo;
    private String so;

    public Nitro5() {
        this.modelo = "Acer Nitro 5";
        this.so = "Windows";
    }

    @Override
    public void imprimeDescricao() {
        System.out.println("--> Criação: Notebook Gamer "+ this.modelo +" com Sistema Operacional "+ this.so +"\n\n");
    }
}