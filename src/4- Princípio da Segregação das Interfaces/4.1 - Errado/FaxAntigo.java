public class FaxAntigo implements Funcoes {
    @Override
    public void imprimir() {
        // VIOLAÇÃO: Um aparelho de fax antigo não imprime.
        System.out.println("Fax antigo não imprime.");
    }

    @Override
    public void digitalizar() {
        // VIOLAÇÃO: Um aparelho de fax antigo não digitaliza.
        System.out.println("Fax antigo não digitaliza.");
    }

    @Override
    public void enviarFax() {
        System.out.println("Enviando fax...");
    }
}