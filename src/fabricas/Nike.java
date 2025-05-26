package fabricas;

import products.CamisaProduct;
import products.Brasil;

public class Nike extends FabricaCreator{
    protected CamisaProduct newCamisa(){
        return new Brasil();
    }
}
