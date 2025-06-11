package parte1_modificado.produtos.notebookUsoGeral;

import parte1_modificado.interfaces.INotebookUsoGeral;

public class Aspire implements INotebookUsoGeral{
    private String modelo;
    private String so;

    public Aspire() {
        this.modelo = "Acer Aspire";
        this.so = "Windows";
    }

    @Override
    public void imprimeDescricao() {
        System.out.println("--> Criação: Notebook Uso Geral geral "+ this.modelo +" com Sistema Operacional "+ this.so +"\n\n");
    }
}
