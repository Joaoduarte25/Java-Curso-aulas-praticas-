package JAVA.UNI3;

public class ALUNOGRADUACAO extends ALUNO implements AVALIACAO {
    
    public ALUNOGRADUACAO(String nome, int matricula, double nota) {
        super(nome, matricula, nota);
    }

    @Override
    public double calcularMedia() {
        return this.getNota() * 1.0;
    
    }
}
