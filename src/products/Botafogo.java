package products;

public class Botafogo extends Camisa implements CamisaProduct{

    public Botafogo() {
        super("Puma", "Botafogo");
    }

    @Override
    public void imprimeDados(){
        System.out.println("================ Camiseta ================");
        System.out.println("=> Fabrica: " + getFabrica());
        System.out.println("=> Time: " + getTime());
        System.out.println("==========================================\n\n");
    }
}
