class Episode {

    int qualTemporada;
    int episodio;

    void play(){
        System.out.println("Playing Episódio " + episodio);
    }

    void skipIntro(){
        System.out.println(" Pulando Abertura ");
    }

    void skipToNext(){
        System.out.println(" Ir para proximo Episode ");
    }
}

class EpisodeTestDrive{
    public static void main(String[] args) {
        Episode episode = new Episode();

        episode.qualTemporada = 4;
        episode.episodio = 10;
        episode.play();
        episode.skipIntro();
        episode.skipToNext();
    }
}