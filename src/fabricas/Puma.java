package fabricas;

import products.CamisaProduct;
import products.Botafogo;

public class Puma extends FabricaCreator{
    protected CamisaProduct newCamisa(){
        return new Botafogo();
    }
}
