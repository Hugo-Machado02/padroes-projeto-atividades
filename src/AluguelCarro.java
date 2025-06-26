public class AluguelCarro {
    public double precoEconomico;
    public double precoExecutivo;
    public double precoLuxo;
    public String carroSelecionado;
    public int diariasSolicitadas;
    public double precoTotal;

    public AluguelCarro() {
        this.precoEconomico = 150;
        this.precoExecutivo = this.precoEconomico * 2;
        this.precoLuxo = this.precoExecutivo * 2;
    }

    public double getprecoTotal(){
        return precoTotal;
    }

    public void setprecoTotal(double valor){
        this.precoTotal = valor;
    }

    public double alugaCarro(String carro, int diarias){
        this.carroSelecionado = carro;
        this.diariasSolicitadas = diarias;
        double valorPorPessoa = 0;
        switch (carro) {
            case "Economico":
                valorPorPessoa += this.precoEconomico;
                break;

            case "Executivo":
                valorPorPessoa += this.precoExecutivo;
                break;
                
            case "Luxo":
                valorPorPessoa += this.precoLuxo;
                break;
        
            default:
                System.out.println("Carro não encontrado!");
                return 0;
        }
        setprecoTotal(valorPorPessoa * diarias);
        return getprecoTotal();
    }

    public String getCarroSelecionado() {
        return carroSelecionado;
    }

    public int getDiariasSolicitadas() {
        return diariasSolicitadas;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    
}
