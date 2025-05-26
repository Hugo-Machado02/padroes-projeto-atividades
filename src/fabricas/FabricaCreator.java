package fabricas;

import products.CamisaProduct;

public abstract class FabricaCreator {
    public CamisaProduct criarCamisa() {
        CamisaProduct camisa = newCamisa();
        return camisa;
    }

    protected abstract CamisaProduct newCamisa();
}