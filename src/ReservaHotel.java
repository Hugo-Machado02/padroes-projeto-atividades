public class ReservaHotel {
    public double precoSimples;
    public double precoExecutivo;
    public double precoPresidencial;
    public String quartoEscolhido;
    public int diariasSolicitadas;
    public double precoTotal;

    public ReservaHotel() {
        this.precoSimples = 200;
        this.precoExecutivo = this.precoSimples * 1.50;
        this.precoPresidencial = precoExecutivo * 3.00;
    }

    public double getprecoTotal(){
        return precoTotal;
    }

    public void setprecoTotal(double valor){
        this.precoTotal = valor;
    }

    public double reservaQuarto(int numPessoas, String quarto, int diarias){
        this.quartoEscolhido = quarto;
        this.diariasSolicitadas = diarias;
        double valorPorPessoa = 0;
        switch (quarto) {
            case "Simples":
                valorPorPessoa += this.precoSimples;
                break;

            case "Executivo":
                valorPorPessoa += this.precoExecutivo;
                break;
                
            case "Presidencial":
                valorPorPessoa += this.precoPresidencial;
                break;
        
            default:
                System.out.println("Quarto não encontrado!");
                return 0;
        }
        setprecoTotal((valorPorPessoa * diarias) * numPessoas);
        return getprecoTotal();
    }

    public String getQuartoEscolhido() {
        return quartoEscolhido;
    }

    public int getDiariasSolicitadas() {
        return diariasSolicitadas;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    
}