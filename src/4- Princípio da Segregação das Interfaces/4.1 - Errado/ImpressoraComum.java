public class ImpressoraComum implements Funcoes {
    @Override
    public void imprimir() {
        System.out.println("Imprimindo documento...");
    }

    @Override
    public void digitalizar() {
        System.out.println("Impressora simples não possui função de digitalizar.");
    }

    @Override
    public void enviarFax() {
        System.out.println("Impressora simples não possui função de fax.");
    }
}
