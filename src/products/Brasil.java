package products;

public class Brasil extends Camiseta implements CamisaProduct{

    public Brasil() {
        super("Nike", "Brasil");
    }

    @Override
    public void imprimeDados(){
        System.out.println("================ Camiseta ================");
        System.out.println("=> Fabrica: " + getFabrica());
        System.out.println("=> Time: " + getTime());
        System.out.println("==========================================\n\n");
    }
}
