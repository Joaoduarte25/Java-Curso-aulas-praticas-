package JAVA.UNI4;

import java.util.ArrayList;
import java.util.List;

interface Observador{
    void atualizar(String mensagem);
}

class CanalNotocia{
    private List<Observador> observadores = new ArrayList<>();
    private String noticia;

    public void adicionarObservador(Observador o){
        observadores.add(o);
    }

    public void removerObservador(Observador o){
        observadores.remove(o);
    }

    public void novaNotiocia(String noticia){
        this.noticia = noticia;
        notificarObservadores();
    }

    private void notificarObservadores(){
        for(Observador o : observadores){
            o.atualizar(noticia);
        }
    }
}

class usuario implements Observador{
    private String nome;

    public usuario(String nome){
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println(nome + " recebeu a notícia: " + mensagem);
    }
}

public class Main4 {
    public static void main(String[] args) {
        CanalNotocia canal = new CanalNotocia();

        usuario u1 = new usuario("Alice");
        usuario u2 = new usuario("Bob");

        canal.adicionarObservador(u1);
        canal.adicionarObservador(u2);

        canal.novaNotiocia("Nova vacina contra a gripe foi desenvolvida!");

        canal.removerObservador(u1);

        canal.novaNotiocia("Previsão do tempo: Chuva amanhã!");
    }
}
