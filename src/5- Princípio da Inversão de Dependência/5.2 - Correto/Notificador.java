public class Notificador { 
    private Mensageiro mensageiro;

    public Notificador(Mensageiro mensageiro) {
        this.mensageiro = mensageiro;
    }

    public void enviarNotificacao(String destinatario, String mensagem) {
        this.mensageiro.enviar(destinatario, mensagem);
    }
}