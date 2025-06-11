package parte2.produtos.carroPopular;

import parte2.interfaces.ICarroPopular;

public class Corolla implements ICarroPopular{
    private String modelo;
    private String ano;

    public Corolla() {
        this.modelo = "Toyota Corolla";
        this.ano = "2018";
    }

    @Override
    public void imprimeDescricao() {
        System.out.println("--> Criação: Carro Popular "+ this.modelo +" ano "+ this.ano +"\n\n");
    }
}
