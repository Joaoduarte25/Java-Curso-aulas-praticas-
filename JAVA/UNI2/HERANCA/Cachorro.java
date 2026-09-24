package HERANCA;

public class Cachorro extends Animal implements Treinavel {
    
    @Override
    public void falar() {
        System.out.println("O cachorro late: Au Au!");
    }

    @Override
    public void executarComando(String comando) {
        System.out.println("O cachorro obedece ao comando: " + comando);
    }

}
