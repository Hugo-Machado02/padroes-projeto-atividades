package prototype;
public class ViolaoDuploZero extends ViolaoPrototype{
    public ViolaoDuploZero() {
        this.tipo = "Duplo Zero";
        this.descricao = "Esse tipo de violao e  categorizado como Parlor, com estrutura menor e sendo mais indicado para uso casual e não tanto profissional. Ele apresenta uma boa sonoridade, sendo indicado para técnicas de fingerstyle. O triplo zero possui tamanho intermediário e gera um timbre mais peculiar";
    }

    public ViolaoDuploZero(ViolaoDuploZero violao) {
        this.tipo = violao.getTipo();
        this.descricao = violao.getDescricao();
    }

    @Override
    public ViolaoPrototype clonar(){
        return(new ViolaoDuploZero(this));
    }
    
}
