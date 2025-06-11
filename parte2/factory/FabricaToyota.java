package parte2.factory;

import parte2.interfaces.ICarroEsportivo;
import parte2.interfaces.ICarroPopular;
import parte2.interfaces.IFabricaCarros;
import parte2.produtos.carroEsportivo.GRSupra;
import parte2.produtos.carroPopular.Corolla;

public class FabricaToyota implements IFabricaCarros{
    @Override
    public void criaCarroEsportivo() {
        ICarroEsportivo newCarro = new GRSupra();
        newCarro.imprimeDescricao();
    }

    @Override
    public void criaCarroPopular() {
        ICarroPopular newCarro = new Corolla();
        newCarro.imprimeDescricao();
        
    }
    
    
}
