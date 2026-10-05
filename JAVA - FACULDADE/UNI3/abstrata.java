package JAVA.UNI3;
abstract class Veiculo {

    protected String modelo;

    protected int velocidadeMaxima;

 

    public Veiculo(String modelo, int velocidadeMaxima) {

        this.modelo = modelo;

        this.velocidadeMaxima = velocidadeMaxima;

    }

 

    public abstract void acelerar(); // Método abstrato

}

 

// Classe concreta (Carro)

class Carro extends Veiculo {

    public Carro(String modelo, int velocidadeMaxima) {

        super(modelo, velocidadeMaxima);

    }

 

    @Override

    public void acelerar() {

        System.out.println("Carro " + modelo + " acelerando até " + velocidadeMaxima + " km/h.");

    }

}

 

// Classe concreta (Moto)

class Moto extends Veiculo {

    public Moto(String modelo, int velocidadeMaxima) {

        super(modelo, velocidadeMaxima);

    }

 

    @Override

    public void acelerar() {

        System.out.println("Moto " + modelo + " acelerando até " + velocidadeMaxima + " km/h.");

    }

}