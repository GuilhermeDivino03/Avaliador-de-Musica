package Principal;

import Models.MaisTocadas;
import Models.Musica;
import Models.PodCast;

public class Main {
    public static void main(String[] args) {

        Musica albumSetanejo = new Musica();
        albumSetanejo.setTituloo("Flor e o beija Flor");
        albumSetanejo.setCantor("Henrique e Juliano");
        albumSetanejo.setGenero("Sertanejo");


        for (int i = 0; i < 100; i++) {
            albumSetanejo.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            albumSetanejo.curte();
        }

        PodCast podpah = new PodCast();
        podpah.setTituloo("PodPah");
        podpah.setEntrevistado("Julio Cocielo");
        podpah.setDescricao("Nesta Quarta feira teremos a ilustre presenca de Julio Cocielo, venham conferir.");

        for (int i = 0; i < 100000; i++) {
            podpah.reproduz();
        }
        for (int i = 0; i < 5000; i++) {
            podpah.curte();

        }

        MaisTocadas melhoresDoMomento = new MaisTocadas();
        melhoresDoMomento.incrui(podpah);
        melhoresDoMomento.incrui(albumSetanejo);
    }
}