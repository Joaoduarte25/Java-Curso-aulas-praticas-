public class Carro {

    private String modelo;

    private int ano;

    private String cor;

 

    // Construtor sem parâmetros

    public Carro() {

        this.modelo = "Desconhecido";

        this.ano = 0;

        this.cor = "Cor indefinida";

    }

 

    // Construtor com um parâmetro

    public Carro(String modelo) {

        this.modelo = modelo;

        this.ano = 2022;

        this.cor = "Cor padrão";

    }

 

    // Construtor com todos os parâmetros

    public Carro(String modelo, int ano, String cor) {

        this.modelo = modelo;

        this.ano = ano;

        this.cor = cor;

    }

 

    public void mostrarInfo() {

        System.out.println("Modelo: " + modelo + ", Ano: " + ano + ", Cor: " + cor);

    }

    public static void main(String[] args) {

        Carro c1 = new Carro("Fusca", 1970, "Azul");

        Carro c2 = new Carro("Civic");

        c1.mostrarInfo();

        c2.mostrarInfo();

    }

}