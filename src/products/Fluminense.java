package products;

public class Fluminense extends Camisa implements CamisaProduct{

    public Fluminense() {
        super("Umbro", "Fluminense");
    }

    @Override
    public void imprimeDados(){
        System.out.println("================ Camiseta ================");
        System.out.println("=> Fabrica: " + getFabrica());
        System.out.println("=> Time: " + getTime());
        System.out.println("==========================================\n\n");
    }
}
