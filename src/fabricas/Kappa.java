package fabricas;

import products.CamisaProduct;
import products.Vasco;

public class Kappa extends FabricaCreator{
    protected CamisaProduct newCamisa(){
        return new Vasco();
    }
}
