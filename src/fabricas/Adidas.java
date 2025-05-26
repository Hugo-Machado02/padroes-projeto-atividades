package fabricas;

import products.CamisaProduct;
import products.Flamengo;

public class Adidas extends FabricaCreator{
    protected CamisaProduct newCamisa(){
        return new Flamengo();
    }
}
