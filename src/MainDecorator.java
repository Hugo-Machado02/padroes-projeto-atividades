public class MainDecorator {

    public static void main(String[] args) {
        Notificacao notificacao = new NotificacaoSimples();
        
        Notificacao notificacaoEmail = new EmailDecorator(notificacao);
        System.out.println(notificacaoEmail.enviar("Bom dia a Todos!"));

        Notificacao notificacaoSMS = new SMSDecorator(notificacao);
        System.out.println(notificacaoSMS.enviar("Salve Rapaziada"));

        Notificacao notificacaoSlack = new SlackDecorator(notificacao);
        System.out.println(notificacaoSlack.enviar("Eai, como estão?"));

        Notificacao notificacaoWhatsApp = new WhatsAppDecorator(notificacao);
        System.out.println(notificacaoWhatsApp.enviar("Bem-vindo"));
    }
}