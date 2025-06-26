import servico_passagemAerea.ClasseVoo;
import servico_passagemAerea.ReservaAssentos;
import servico_passagemAerea.informacaoAssento;


class PassagemAerea {
    private ReservaAssentos assento;
    private ClasseVoo classe;
    private informacaoAssento infosAssento;
    private String assentoSelecionado;
    private String ClasseSelecionada;
    private double valorTotal;

    public PassagemAerea() {
        this.assento = new ReservaAssentos();
        this.classe = new ClasseVoo();
        this.infosAssento = new informacaoAssento();
    }

    public double ReservarPassagem(String assentoString) {
        int fileira;
        char letra;

        try {
            fileira = Integer.parseInt(assentoString.substring(0, assentoString.length() - 1));
            letra = Character.toUpperCase(assentoString.charAt(assentoString.length() - 1));
        } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
            System.err.println("Erro: Formato de assento inválido: " + assentoString);
            return 0.0;
        }

        if (!assento.reservarAssento(fileira, letra)) {
            return 0.0;
        }

        String classe = this.classe.getClassePorFileira(fileira);
        if (classe.equals("Inválida")) {
            System.err.println("Erro: Classe de assento inválida para fileira " + fileira);
            return 0.0; 
        }

        double custo = this.classe.calcularPrecoPorClasse(classe);
        if (custo == 0.0) {
            System.err.println("Erro: Não foi possível calcular o custo da passagem.");
            return 0.0;
        }

        String posicao = this.infosAssento.getPosicaoAssento(letra);
        String lado = this.infosAssento.getLadoAeronave(letra);
        
        this.assentoSelecionado = String.format("Assento: %d%c | Posição: %s | Lado: %s", fileira, letra, posicao, lado);
        this.ClasseSelecionada = classe;
        this.valorTotal = custo;

        return this.valorTotal;
    }

    public String getAssentoSelecionado() {
        return assentoSelecionado;
    }

    public String getClasseSelecionada() {
        return ClasseSelecionada;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}