package parte2.factory;

import parte2.interfaces.ICarroEsportivo;
import parte2.interfaces.ICarroPopular;
import parte2.interfaces.IFabricaCarros;
import parte2.produtos.carroEsportivo.GolfGTI;
import parte2.produtos.carroPopular.Polo;

public class FabricaVolkswagen implements IFabricaCarros{
    @Override
    public void criaCarroEsportivo() {
        ICarroEsportivo newCarro = new GolfGTI();
        newCarro.imprimeDescricao();
    }

    @Override
    public void criaCarroPopular() {
        ICarroPopular newCarro = new Polo();
        newCarro.imprimeDescricao();
        
    }
    
    
}
