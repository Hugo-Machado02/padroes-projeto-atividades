package parte1_modificado.produtos.notebookUsoGeral;

import parte1_modificado.interfaces.INotebookUsoGeral;

public class Inspiron implements INotebookUsoGeral{
    private String modelo;
    private String so;

    public Inspiron() {
        this.modelo = "Dell Inspiron";
        this.so = "Windows";
    }

    @Override
    public void imprimeDescricao() {
        System.out.println("--> Criação: Notebook Uso Geral "+ this.modelo +" com Sistema Operacional "+ this.so +"\n\n");
    }
}
