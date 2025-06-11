package parte2_modificado.produtos.carroPopular;

import parte2_modificado.interfaces.ICarroPopular;

public class Argo implements ICarroPopular{
    private String modelo;
    private String ano;

    public Argo() {
        this.modelo = "Fiat Argo";
        this.ano = "2017";
    }

    @Override
    public void imprimeDescricao() {
        System.out.println("--> Criação: Carro Popular "+ this.modelo +" ano "+ this.ano +"\n\n");
    }
}
