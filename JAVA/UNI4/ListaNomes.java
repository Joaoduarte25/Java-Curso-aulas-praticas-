package JAVA.UNI4;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ListaNomes {
    private ArrayList<String> nomes = new ArrayList<>();

    public void adicionarNome(String pnome){
        nomes.add(pnome);
    }
    public void removerNome(String pnome){
        nomes.remove(pnome);
    }
    public void listarNomes(){
        for(String nome : nomes){
            System.out.println(nome);
        }
    }

    public static void main(String[] args) {
        ListaNomes lista = new ListaNomes();
        lista.adicionarNome("Alice");
        lista.adicionarNome("Bob");
        lista.adicionarNome("Charlie");

        System.out.println("Nomes na lista:");
        lista.listarNomes();

        lista.removerNome("Bob");
        System.out.println("\nNomes após remover Bob:");
        lista.listarNomes();
    }
}