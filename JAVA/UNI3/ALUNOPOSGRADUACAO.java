package JAVA.UNI3;

public class ALUNOPOSGRADUACAO extends ALUNO implements AVALIACAO {
    
    public ALUNOPOSGRADUACAO(String nome, int matricula, double nota) {
        super(nome, matricula, nota);
    }

    @Override
    public double calcularMedia() {
        return getNota() * 1.2;
    }
    
}
