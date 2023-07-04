package Models;

public class PodCast extends Audio{
    private String entrevistado;
    private String descricao;

    public String getEntrevistado() {
        return entrevistado;
    }

    public void setEntrevistado(String entrevistado) {
        this.entrevistado = entrevistado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if (this.getCurtidas() >= 500){
            return 10;
        }else
            return 5;
    }
}
