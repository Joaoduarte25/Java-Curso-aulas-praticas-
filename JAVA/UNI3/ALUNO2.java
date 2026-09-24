package JAVA.UNI3;

public class ALUNO2 {
    private String nome;
    private int matricula;
    private double nota;

    public ALUNO2(String nome, int matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        setNota(nota);
        
    }
     public void setNota(double nota) {
        try {
            if (nota < 0 || nota > 10) {
                throw new IllegalArgumentException("Nota inválida. Deve ser entre 0 e 10.");
            }
            this.nota = nota;
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }finally {
            System.out.println("Processamento da nota concluído.");
        } 
    }
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Matrícula: " + matricula + ", Nota: " + nota);
    }
}
class Main {
    public static void main(String[] args) {
        ALUNO2 aluno1 = new ALUNO2("João", 12345, 8.5);
        aluno1.exibirInformacoes();

        // Testando nota inválida
        ALUNO2 aluno2 = new ALUNO2("Maria", 54321, 11.0);
        aluno2.exibirInformacoes();
    }
    
}