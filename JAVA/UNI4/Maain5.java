package JAVA.UNI4;

import java.util.Arrays;

class GerenciadorArray {
    private int[] array;
    private int tamanhho;

    public GerenciadorArray(int capacidade) {
        array = new int[capacidade];
        tamanhho = 0;
    }

    public void inserir(int valor){
        if (tamanhho < array.length) {
            array[tamanhho++] = valor;
        }
    }

    public void remover(int valor){
        for(int i = 0; i < tamanhho; i++){
            if (array[i] == valor){
                array[i] = array[tamanhho - 1];
                tamanhho--;
                return;
            }
        }
    }

    public boolean pesquisar(int valor){
        for(int i = 0; i < tamanhho; i++){
            if (array[i] == valor) {
                return true;
            }
        }
        return false;
    }

    public void exibir(){
        System.out.println(Arrays.toString(Arrays.copyOf(array, tamanhho)));
    }

}

public class Maain5 {
    public static void main(String[] args) {
        GerenciadorArray gerenciador = new GerenciadorArray(10);
        gerenciador.inserir(5);
        gerenciador.inserir(10);
        gerenciador.inserir(15);
        gerenciador.exibir(); // [5, 10, 15]

        gerenciador.remover(10);
        gerenciador.exibir(); // [5, 15]

        boolean encontrado = gerenciador.pesquisar(5); // true
        System.out.println("Encontrado: " + encontrado);

        encontrado = gerenciador.pesquisar(10); // false
        System.out.println("Encontrado: " + encontrado);
    }
}
    
