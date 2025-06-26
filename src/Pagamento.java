public class Pagamento {
    private double jurosPorParcela;
    private String metodoPagamento;
    private double Desconto_acrescimo;
    private double valorInicial;
    private double valorTotal;
    private String info;
    private int parcelasCredito;
    
    public Pagamento() {
        this.jurosPorParcela = 0.0399;
        this.Desconto_acrescimo = 0;
        this.valorTotal = 0;
        this.info = "Nenhum";
        this.parcelasCredito = 1;
    }

    public void realizaPagamento(String metodoPagamento, double valor, int parcelas) {
        this.valorInicial = valor;
        this.metodoPagamento = metodoPagamento.toLowerCase();
        this.parcelasCredito = parcelas;
        
        this.valorTotal = this.valorInicial;
        this.Desconto_acrescimo = 0;
        this.info = "Nenhum";

        switch (this.metodoPagamento) {
            case "pix":
                this.Desconto_acrescimo = this.valorInicial * 0.10;
                this.valorTotal = this.valorInicial - this.Desconto_acrescimo;
                this.info = "Desconto";
                break;

            case "boleto":
                this.Desconto_acrescimo = this.valorInicial * 0.05;
                this.valorTotal = this.valorInicial - this.Desconto_acrescimo;
                this.info = "Desconto";
                break;

            case "debito":
                this.Desconto_acrescimo = 0;
                this.valorTotal = this.valorInicial;
                this.info = "Desconto";
                break;

            case "credito":
                if (this.parcelasCredito >= 2 && this.parcelasCredito <= 6) {
                    double acrescimoTotal = 0;
                    double valorParcelaBase = this.valorInicial / this.parcelasCredito;

                    for (int i = 2; i <= this.parcelasCredito; i++) {
                        acrescimoTotal += valorParcelaBase * this.jurosPorParcela;
                    }
                    this.valorTotal = this.valorInicial + acrescimoTotal;
                    this.Desconto_acrescimo = acrescimoTotal;
                    this.info = "Acréscimo";

                } else if (parcelas == 1) {
                    this.valorTotal = this.valorInicial;
                    this.Desconto_acrescimo = 0;
                    this.info = "Desconto";

                } else {
                    System.err.println("Erro: Número de parcelas inválido para crédito. Permite 1 a 6 parcelas.");
                    this.valorTotal = 0;
                    this.Desconto_acrescimo = 0;
                    this.info = "Erro";
                }
                break;

            default:
                System.err.println("Erro: Método de pagamento não encontrado!");
                this.valorTotal = 0;
                this.Desconto_acrescimo = 0;
                this.info = "Erro";
                break;
        }
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public double getDesconto_acrescimo() {
        return Desconto_acrescimo;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getInfo() {
        return info;
    }

    public int getParcelasCredito() {
        return parcelasCredito;
    }
}
