import java.io.File;
import java.util.Scanner;

public class Sequencial {
    public static void main(String[] args) {
        try {
            long inicio = System.currentTimeMillis();

            File arquivo = new File("C:\\Users\\joaos\\Documents\\FACULDADE - ADS\\Terceiro semestre\\SISTEMAS OPERACIONAIS\\dados.txt.txt");

            Scanner ler = new Scanner(arquivo);

            while (ler.hasNextLine()) {
                System.out.println(ler.nextLine());
            }

            ler.close();

            long fim = System.currentTimeMillis();

            System.out.println("Tempo de execução: " + (fim - inicio) + " ms");

        } catch (Exception e) {
            System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
        }
    }
}