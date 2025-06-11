package parte2_modificado.factory;

import parte2_modificado.interfaces.ICarroEsportivo;
import parte2_modificado.interfaces.ICarroPopular;
import parte2_modificado.interfaces.IFabricaCarros;
import parte2_modificado.produtos.carroEsportivo.GolfGTI;
import parte2_modificado.produtos.carroPopular.Polo;

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
