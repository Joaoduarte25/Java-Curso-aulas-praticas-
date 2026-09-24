class StreamingSong {
    String titulo;
    String artista;
    int duracao;

    void play(){
        System.out.println("tocando Som");
    }

    void printDetails(){
        System.out.println("essa é " + titulo + " do " + artista + " com a duração de " + duracao + " Minutos ");
    }
}

class StreamingSongTestDriver{
    public static void main(String[] args){
        StreamingSong song = new StreamingSong();
        song.artista = " The Beatles";
        song.titulo = "Come Together";
        song.duracao = 3;
        song.play();
        song.printDetails();
    }
}
