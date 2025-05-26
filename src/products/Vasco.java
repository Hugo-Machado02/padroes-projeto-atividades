package products;

public class Vasco extends Camiseta implements CamisaProduct{

    public Vasco() {
        super("Kappa", "Vasco");
    }

    @Override
    public void imprimeDados(){
        System.out.println("================ Camiseta ================");
        System.out.println("=> Fabrica: " + getFabrica());
        System.out.println("=> Time: " + getTime());
        System.out.println("==========================================\n\n");
    }
}
