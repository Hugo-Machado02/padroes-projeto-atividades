public class ImpressoraMultifuncional implements Impressao, Digitalizadora, Fax {
    @Override
    public void imprimir() {
        System.out.println("Impressora multifuncional imprimindo...");
    }

    @Override
    public void digitalizar() {
        System.out.println("Impressora multifuncional digitalizando...");
    }

    @Override
    public void enviarFax() {
        System.out.println("Impressora multifuncional enviando fax...");
    }
}