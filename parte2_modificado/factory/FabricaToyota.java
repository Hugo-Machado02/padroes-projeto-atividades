package parte2_modificado.factory;

import parte2_modificado.interfaces.ICarroEsportivo;
import parte2_modificado.interfaces.ICarroPopular;
import parte2_modificado.interfaces.IFabricaCarros;
import parte2_modificado.produtos.carroEsportivo.GRSupra;
import parte2_modificado.produtos.carroPopular.Corolla;

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
