class EmailDecorator extends NotificacaoDecorator {
    public EmailDecorator(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public String enviar(String mensagem) {
        return super.enviar(mensagem) + " ==> Enviado por Email";
    }
}