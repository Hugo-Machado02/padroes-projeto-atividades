package products;

public class Flamengo extends Camiseta implements CamisaProduct{

    public Flamengo() {
        super("Adidas", "Flamengo");
    }

    @Override
    public void imprimeDados(){
        System.out.println("================ Camiseta ================");
        System.out.println("=> Fabrica: " + getFabrica());
        System.out.println("=> Time: " + getTime());
        System.out.println("==========================================\n\n");
    }
}