public class MovieTestDrive{
    public static void main(String[] args){
        Movie one = new Movie();
        one.titulo = "Dois Homens e meio";
        one.genero = "Comedia";
        one.avaliacao = 5;

        Movie two = new Movie();
        two.titulo = "Friends";
        two.genero = "Comedia";
        two.avaliacao = 2;
        two.iniciar();

        Movie three = new Movie();
        three.titulo = "Perdido Em Marte";
        three.genero = "Drama e Ficcao Cientifica";
        three.avaliacao = 3;
    }
}
