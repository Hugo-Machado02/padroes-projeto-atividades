import java.util.Random;

public class Captcha {
    private String caracteres = "0123456789!@#$%^&*";

    public String gerarCodigo(int tamanho) {
        StringBuilder codigoGerado = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < tamanho; i++) {
            int indiceString = rand.nextInt(this.caracteres.length());
            codigoGerado.append(this.caracteres.charAt(indiceString));
        }

        return codigoGerado.toString();
    }
}
