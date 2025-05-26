package fabricas;

import products.CamisaProduct;
import products.Fluminense;

public class Umbro extends FabricaCreator{
    protected CamisaProduct newCamisa(){
        return new Fluminense();
    }
}
