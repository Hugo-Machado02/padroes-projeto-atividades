package parte2_modificado.factory;

import parte2_modificado.interfaces.ICarroEsportivo;
import parte2_modificado.interfaces.ICarroPopular;
import parte2_modificado.interfaces.IFabricaCarros;
import parte2_modificado.produtos.carroEsportivo.PulseAbarth;
import parte2_modificado.produtos.carroPopular.Argo;

public class FabricaFiat implements IFabricaCarros{
    @Override
    public void criaCarroEsportivo() {
        ICarroEsportivo newCarro = new PulseAbarth();
        newCarro.imprimeDescricao();
    }

    @Override
    public void criaCarroPopular() {
        ICarroPopular newCarro = new Argo();
        newCarro.imprimeDescricao();
        
    }
    
    
}
