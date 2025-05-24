package prototype;
public class ViolaoTriploZero extends ViolaoPrototype{
    public ViolaoTriploZero() {
        this.tipo = "Triplo Zero";
        this.descricao = "Esse tipo de violao e  categorizado como Parlor, com estrutura menor e sendo mais indicado para uso casual e não tanto profissional. Ele possui tamanho intermediário e gera um timbre mais peculiar";
    }

    public ViolaoTriploZero(ViolaoTriploZero violao) {
        this.tipo = violao.getTipo();
        this.descricao = violao.getDescricao();
    }

    @Override
    public ViolaoPrototype clonar(){
        return(new ViolaoTriploZero(this));
    }
}
