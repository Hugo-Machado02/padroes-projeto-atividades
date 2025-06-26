package servico_passagemAerea;

public class informacaoAssento {
    public String getPosicaoAssento(char letraAssento) {
        switch (Character.toUpperCase(letraAssento)) {
            case 'A':
            case 'F':
                return "Janela";
            case 'B':
            case 'E':
                return "Meio";
            case 'C':
            case 'D':
                return "Corredor";
            default:
                return "Desconhecida";
        }
    }

    public String getLadoAeronave(char letraAssento) {
        char letraUpper = Character.toUpperCase(letraAssento);
        if (letraUpper >= 'A' && letraUpper <= 'C') {
            return "Esquerdo";
        } else if (letraUpper >= 'D' && letraUpper <= 'F') {
            return "Direito";
        }
        return "Desconhecido";
    }
}
