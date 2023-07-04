package Models;

public class MaisTocadas {

    public void incrui(Audio audio){
        if(audio.getClassificacao() >= 9) {
            System.out.println(audio.getTituloo() + " A mais tocada do momento, numero 1 no mundo!.");
        }else
            System.out.println(audio.getTituloo()+ " Esta dentro do top ouvintes, adicione a sua playlist.");
    }
}
