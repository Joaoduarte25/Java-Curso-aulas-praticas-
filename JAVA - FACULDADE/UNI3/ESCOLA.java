package JAVA.UNI3;

public class ESCOLA {

    public static void main(String[] args) {

        ALUNO aluno1 = new ALUNO("João", 12345, 8.5);

        aluno1.exibirInformacoes();

        System.out.println("--- ********** ---");
        AVALIACAO alunoGrad = new ALUNOGRADUACAO("Maria", 54321, 9.0);
        AVALIACAO alunoPosGrad = new ALUNOPOSGRADUACAO("Carlos", 67890, 7.5);

        System.out.println("Média do Aluno de Graduação: " + alunoGrad.calcularMedia());
        System.out.println("Média do Aluno de Pós-Graduação: " + alunoPosGrad.calcularMedia());

    }
}
