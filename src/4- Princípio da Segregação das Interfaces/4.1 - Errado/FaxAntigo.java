public class FaxAntigo implements Funcoes {
    @Override
    public void imprimir() {
        System.out.println("Fax antigo não imprime.");
    }

    @Override
    public void digitalizar() {
        System.out.println("Fax antigo não digitaliza.");
    }

    @Override
    public void enviarFax() {
        System.out.println("Enviando fax...");
    }
}