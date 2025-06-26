public class MainFacade {
    public static void main(String[] args) {
        // Exemplo 1: Casal viajando - Classe Executiva
        System.out.println("EXEMPLO 1: CASAL - CLASSE EXECUTIVA");
        SistemaPacotesViagem app = new SistemaPacotesViagem();
        
        app.adicionarCliente("Hugo Machado", "638.235.642-12");
        app.adicionarCliente("Shayra Kelly", "826.001.173-82");
    
        app.reservarPassagemAerea("Hugo Machado", "4A");
        app.reservarPassagemAerea("Shayra Kelly", "4B");
        app.reservarHotel(2, "Presidencial", 5);
        app.alugarCarro("Luxo", 5);
        app.processarPagamento("pix", 1);
        
        app.imprimirResumoPacote();
    }
}