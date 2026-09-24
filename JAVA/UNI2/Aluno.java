public class Aluno {

    private String nome;
    private String email;
    private int idade;
    private String cursoMatriculado;

 

    // Construtor padrão

    public Aluno() {

        this.nome = "Nome Indefinido";

        this.email = "Email Indefinido";

        this.idade = 0;

        this.cursoMatriculado = "Curso não definido";

    }

    // Construtor com parâmetros

    public Aluno(String nome, String email, int idade) {

        this.nome = nome;

        this.email = email;

        this.idade = idade;

        this.cursoMatriculado = "Curso não definido";

    }


    // Sobrecarga com curso matriculado

    public Aluno(String nome, String email, int idade, String cursoMatriculado) {

        this.nome = nome;

        this.email = email;

        this.idade = idade;

        this.cursoMatriculado = cursoMatriculado;

    }

    public void mostrarInfo() {

        System.out.println("Nome: " + nome + ", Email: " + email + ", Idade: " + idade + ", Curso: " + cursoMatriculado);

    }

    public static void main(String[] args) {

        Aluno a1 = new Aluno("João", "joao@email.com", 20, "Engenharia");

        Aluno a2 = new Aluno("Maria", "maria@email.com", 22);

        a1.mostrarInfo();

        a2.mostrarInfo();

    }

}