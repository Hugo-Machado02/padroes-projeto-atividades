package prototype;
public class ViolaoFolk extends ViolaoPrototype{

    public ViolaoFolk() {
        this.tipo = "Folk";
        this.descricao = "Com o corpo maior e mais “acinturado”, os violões do tipo folk também são bastante populares entre os músicos. A maioria dos modelos desse tipo de violão funciona com a utilização de cordas de aço, podendo ser elétricos ou eletroacústicos. Esse tipo de violão é o mais indicado para gêneros como pop e rock, já que gera um som mais encorpado, com timbre diferenciado";
    }

    public ViolaoFolk(ViolaoFolk violao) {
        this.tipo = violao.getTipo();
        this.descricao = violao.getDescricao();
    }

    @Override
    public ViolaoPrototype clonar(){
        return(new ViolaoFolk(this));
    }
}
