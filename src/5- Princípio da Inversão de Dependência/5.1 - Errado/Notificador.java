public class Notificador{
    private EmailService emailService;

    public Notificador() {
        this.emailService = new EmailService();
    }

    public void enviarNotificacao(String destinatario, String mensagem) {
        this.emailService.enviar(destinatario, mensagem);
    }
}