public class VerificacaoIdade {

    public static void main(String[] args) {

        int idadeUsuario = 15; // Idade de exemplo

        String classificacaoConteudo = "16+"; // Classificação do conteúdo

 

        if (classificacaoConteudo.equals("Livre")) {

            System.out.println("Acesso permitido para todas as idades.");

        } else if (classificacaoConteudo.equals("12+") && idadeUsuario >= 12) {

            System.out.println("Acesso permitido.");

        } else if (classificacaoConteudo.equals("16+") && idadeUsuario >= 16) {

            System.out.println("Acesso permitido.");

        } else if (classificacaoConteudo.equals("18+") && idadeUsuario >= 18) {

            System.out.println("Acesso permitido.");

        } else {

            System.out.println("Acesso negado. Idade insuficiente.");

        }

    }

}