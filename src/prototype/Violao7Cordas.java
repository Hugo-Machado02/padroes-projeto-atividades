package prototype;
public class Violao7Cordas extends ViolaoPrototype{

    public Violao7Cordas() {
        this.tipo = "7 Cordas";
        this.descricao = "Conhecido como o violão brasileiro, já que é indicado para acompanhar gêneros como o choro e o samba, esse tipo de violão não apresenta diferenças na sua estrutura quando comparado ao violão clássico. Porém seu diferencial está na sétima corda, que costuma ser afinada de maneira mais grave que as outras seis. Isso exige um conhecimento do músico que for tocá-lo";
    }

    public Violao7Cordas(Violao7Cordas violao) {
        this.tipo = violao.getTipo();
        this.descricao = violao.getDescricao();
    }

    @Override
    public ViolaoPrototype clonar(){
        return(new Violao7Cordas(this));
    }
}
