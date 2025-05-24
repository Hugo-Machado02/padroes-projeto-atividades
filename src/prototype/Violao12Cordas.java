package prototype;
public class Violao12Cordas extends ViolaoPrototype {
    public Violao12Cordas() {
        this.tipo = "12 Cordas";
        this.descricao = "Outro tipo de violão que também não apresenta diferenças na estrutura, o violão 12 cordas traz o dobro de cordas do que o clássico. Essas são agrupadas em duplas (metade delas afinadas com uma oitava acima). Esse tipo apresenta ressonância plena e exige técnica e prática para poder pressionar duas cordas simultaneamente";
    }

    public Violao12Cordas(Violao12Cordas violao) {
        this.tipo = violao.getTipo();
        this.descricao = violao.getDescricao();
    }

    @Override
    public ViolaoPrototype clonar(){
        return(new Violao12Cordas(this));
    }
}
