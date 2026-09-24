package JAVA.UNI3;

abstract class Pessoa {
    protected String nome;  

    public Pessoa(String nome){
        this.nome = nome;
    }

    public abstract void apresentar();
    
}

class ALUNO extends Pessoa {
    private int matricula;
    private double nota;

    public ALUNO(String nome, int matricula, double nota) {
        super(nome);
        this.matricula = matricula;
        this.nota = nota;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + " e minha matrícula é " + matricula + ".");
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Matrícula: " + matricula + ", Nota: " + nota);
    }

    // Getters e setters para nota
    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            System.out.println("Nota inválida. Deve ser entre 0 e 10.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ALUNO aluno1 = new ALUNO("João", 12345, 8.5);
        aluno1.apresentar();

        System.out.println("hello world");
    }
}