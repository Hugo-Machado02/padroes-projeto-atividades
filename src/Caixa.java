import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Caixa implements ItemComponent{
    private String nivel;
    private int limite;
    private HashMap<String, Double> catalogo;
    private ArrayList<ItemComponent> itensSelecionados;

    public Caixa(String nivel){
        this.nivel = nivel;
        this.limite = instanciaLimite();
        this.catalogo = new HashMap<>();
        this.itensSelecionados = new ArrayList<>();
        instanciaCatalogo();
        preencherCaixa();
    }

    public int instanciaLimite(){
        if(this.nivel.equals("Platina")){
            return 10;
        }
        else if(this.nivel.equals("Ouro")){
            return 7;
        }
        else if(this.nivel.equals("Prata")){
            return 5;
        }
        else{
            return 3;
        }
    }

    private void instanciaCatalogo(){
        addCatalogo("Quadrinho", 15.0);
        addCatalogo("Chaveiro", 5.0);
        addCatalogo("Busto", 10.0);
        addCatalogo("Adesivo", 1.0);
        addCatalogo("Poster", 25.0);
        addCatalogo("Camiseta", 25.0);
        addCatalogo("Caneta", 3.0);
        addCatalogo("Miniatura", 20.0);
    }

    private void preencherCaixa(){
        List<Map.Entry<String, Double>> listaItens = new ArrayList<>(catalogo.entrySet());
        for(int i=0; i < this.limite; i++){
            Random random = new Random();
            int index = random.nextInt(listaItens.size());

            Map.Entry<String, Double> item = listaItens.get(index);
            addItemSelecionado(new ItemFolha(item.getKey(), item.getValue()));
        }  
    }

    public String getNome(){
        return "Caixa de Assinatura: Nivel " + nivel;
    }

    public double getValor(){
        double valorTotal = 0;
        for(ItemComponent item : this.getItensSelecionados()){
            valorTotal += item.getValor();
        }
        return valorTotal;
    }
    
    public HashMap<String, Double> getCatalogo(){
        return catalogo;
    }
    
    public ArrayList<ItemComponent> getItensSelecionados() {
        return itensSelecionados;
    }

    private void addCatalogo(String nome, double valor) {
        this.catalogo.put(nome, valor);
    }

    private void addItemSelecionado(ItemComponent item){
        this.itensSelecionados.add(item);
    }

    public void exibirDetalhes(){
        System.out.println("===========================================================");
        System.out.println("==> " + this.getNome() + " - " + this.limite + " Itens");
        System.out.println("===========================================================");

        for(ItemComponent item: getItensSelecionados()){
            System.out.println("Item: "+ item.getNome());
            System.out.println("Valor: "+ item.getValor());
            System.out.println("-----------------------------------------------------------");

        }
        System.out.println("Valor Total: "+ this.getValor());
        System.out.println("===========================================================\n\n");
    }
}
