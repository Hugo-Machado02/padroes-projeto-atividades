public class EmailService implements Mensageiro {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("Enviando E-mail para " + destinatario + ": " + mensagem);
    }
}
