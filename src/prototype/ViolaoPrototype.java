package prototype;
public abstract class ViolaoPrototype{
    protected String tipo;
    protected String descricao;

    public abstract ViolaoPrototype clonar();

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}