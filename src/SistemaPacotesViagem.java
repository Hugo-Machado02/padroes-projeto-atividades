import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SistemaPacotesViagem {
    private PassagemAerea sistemaPassagem;
    private ReservaHotel hotel;
    private AluguelCarro carro;
    private Pagamento pagamento;
    private List<Cliente> clientes;
    private Map<Cliente, String> passagensClientes;
    private Map<Cliente, Double> valoresPassagens;
    private double valorTotalPacote;
    private boolean hotelReservado = false;
    private boolean carroAlugado = false;
    private boolean pagamentoRealizado = false;

    public SistemaPacotesViagem() {
        this.sistemaPassagem = new PassagemAerea();
        this.hotel = new ReservaHotel();
        this.carro = new AluguelCarro();
        this.pagamento = new Pagamento();
        this.clientes = new ArrayList<>();
        this.passagensClientes = new HashMap<>();
        this.valoresPassagens = new HashMap<>();
        this.valorTotalPacote = 0;
    }

    public void adicionarCliente(String nome, String cpf) {
        this.clientes.add(new Cliente(nome, cpf));
    }

    public boolean reservarPassagemAerea(String nomeCliente, String assento) {
        Cliente cliente = buscarClientePorNome(nomeCliente);
        if (cliente != null) {
            double valorPassagem = sistemaPassagem.ReservarPassagem(assento);
            if (valorPassagem > 0) {
                this.passagensClientes.put(cliente, assento);
                this.valoresPassagens.put(cliente, valorPassagem);
                this.valorTotalPacote += valorPassagem;
                return true;
            }
        }
        return false;
    }
    
    private Cliente buscarClientePorNome(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nome)) {
                return cliente;
            }
        }
        return null;
    }

    public boolean reservarHotel(int numPessoas, String tipoQuarto, int diarias) {
        double valorHotel = this.hotel.reservaQuarto(numPessoas, tipoQuarto, diarias);
        if (valorHotel > 0) {
            this.valorTotalPacote += valorHotel;
            this.hotelReservado = true;
            return true;
        }
        return false;
    }
    
    public boolean alugarCarro(String tipoCarro, int diarias) {
        double valorCarro = this.carro.alugaCarro(tipoCarro, diarias);
        if (valorCarro > 0) {
            this.valorTotalPacote += valorCarro;
            this.carroAlugado = true;
            return true;
        }
        return false;
    }

    public boolean processarPagamento(String metodoPagamento, int parcelas) {
        if (this.valorTotalPacote > 0) {
            this.pagamento.realizaPagamento(metodoPagamento, this.valorTotalPacote, parcelas);
            this.pagamentoRealizado = true;
            return true;
        }
        return false;
    }

    public void imprimirResumoPacote() {
        System.out.println("\n============================================================");
        System.out.println("           RESUMO DO PACOTE DE VIAGEM");
        System.out.println("============================================================");
        
        System.out.println("\nDADOS DOS COMPRADORES:");
        System.out.println("------------------------------");
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            System.out.println((i + 1) + ". Nome: " + cliente.getNome());
            System.out.println("   CPF: " + cliente.getCpf());
        }
        
        if (!passagensClientes.isEmpty()) {
            System.out.println("\nPASSAGENS AÉREAS:");
            System.out.println("-------------------------");
            for (Map.Entry<Cliente, String> entry : passagensClientes.entrySet()) {
                Cliente cliente = entry.getKey();
                String assento = entry.getValue();
                double valor = valoresPassagens.get(cliente);
                
                PassagemAerea tempPassagem = new PassagemAerea();
                tempPassagem.ReservarPassagem(assento);
                
                System.out.println("Passageiro: " + cliente.getNome());
                System.out.println("  " + tempPassagem.getAssentoSelecionado());
                System.out.println("  Classe: " + tempPassagem.getClasseSelecionada());
                System.out.println("  Valor: R$ " + String.format("%.2f", valor));
                System.out.println();
            }
        }
        
        if (hotelReservado) {
            System.out.println("\nHOTEL:");
            System.out.println("----------");
            System.out.println("Quarto: " + hotel.getQuartoEscolhido());
            System.out.println("Diárias: " + hotel.getDiariasSolicitadas());
            System.out.println("Valor: R$ " + String.format("%.2f", hotel.getPrecoTotal()));
        }
        
        if (carroAlugado) {
            System.out.println("\nALUGUEL DE CARRO:");
            System.out.println("--------------------");
            System.out.println("Categoria: " + carro.getCarroSelecionado());
            System.out.println("Diárias: " + carro.getDiariasSolicitadas());
            System.out.println("Valor: R$ " + String.format("%.2f", carro.getPrecoTotal()));
        }
        
        if (pagamentoRealizado) {
            System.out.println("\nPAGAMENTO:");
            System.out.println("---------------");
            System.out.println("Método: " + pagamento.getMetodoPagamento().toUpperCase());
            if (pagamento.getParcelasCredito() > 1) {
                System.out.println("Parcelas: " + pagamento.getParcelasCredito() + "x");
            }
            System.out.println("Valor do Pacote: R$ " + String.format("%.2f", valorTotalPacote));
            if (pagamento.getDesconto_acrescimo() != 0) {
                double valor = pagamento.getDesconto_acrescimo();
                if (valor < 0) valor = -valor;
                System.out.println(pagamento.getInfo() + ": R$ " + String.format("%.2f", valor));
            }
            System.out.println("Valor Final: R$ " + String.format("%.2f", pagamento.getValorTotal()));
        }
        
        System.out.println("\n============================================================");
    }
}
