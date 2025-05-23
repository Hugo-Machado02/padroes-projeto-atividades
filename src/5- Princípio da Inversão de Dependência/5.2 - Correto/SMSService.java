public class SMSService implements Mensageiro {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("Enviando SMS para " + destinatario + ": " + mensagem);
    }
}