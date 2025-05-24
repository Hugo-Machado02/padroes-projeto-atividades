package prototype;
public class ViolaoClassico extends ViolaoPrototype{

    public ViolaoClassico() {
        this.tipo = "Classico";
        this.descricao = "O violao classico é um modelo acustico e funciona com seis cordas (na maioria das vezes, feitas de nylon). Alem da facilidade em encontrar esse modelo, ele possui um custo mais baixo quando comparado aos outros tipos, e tambem e indicado para iniciantes graças a sua leveza e maciez";
    }

    public ViolaoClassico(ViolaoClassico violao) {
        this.tipo = violao.getTipo();
        this.descricao = violao.getDescricao();
    }

    @Override
    public ViolaoPrototype clonar(){
        return(new ViolaoClassico(this));
    }
}
