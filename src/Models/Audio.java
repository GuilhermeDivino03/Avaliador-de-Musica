package Models;

public class Audio {

    private String titulo;
    private int classificacao;
    private int curtidas;
    private int totalDeReproducoes;

    public String getTituloo() {
        return titulo;
    }

    public void setTituloo(String tituloo) {
        this.titulo = tituloo;
    }

    public int getClassificacao() {
        return classificacao;
    }


    public int getCurtidas() {
        return curtidas;
    }


    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void curte(){
        this.curtidas++;
    }

    public void reproduz(){
        this.totalDeReproducoes++;
    }

}
