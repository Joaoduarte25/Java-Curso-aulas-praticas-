public class GuessGame{
    // O guessGame Tem 3 Variaveis de instancia para 3 objetos jogadores ⬇️

    Player p1;
    Player p2;
    Player p3;

    // Cria 3 objetos jogadores e os atribuiu as 3 variaveis de instancia player ⬇️

    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        // declara 3 variaveis para armazenar 3 palpites dos jogadores ⬇️

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        // Declara 3 variaveis para armazenar um valor verdadeiro ou falso com base na resposta do jogador ️️️️⬇️

        boolean p1sRight = false;
        boolean p2sRight = false;
        boolean p3sRight = false;

        // Cria um numero "alvo" que os jogadores tem que adivinhar ⬇️

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Estou Pensando em um Numero Que Está entre o 0 e 9...");

        while(true){
            System.out.println("O número a ser adivinhado é " + targetNumber);

            // Chama o metodo guess() de cada pessoa ⬇️

            p1.guess();
            p2.guess();
            p3.guess();

            // recebe o palpite de cada ( o resultado de exe do metodo guess() ) acessando a variavel do palpite de cada um⬇️

            guessp1 = p1.number;
            System.out.println("palpite do jogador um " + guessp1);

            guessp2 = p2.number;
            System.out.println("palpite do jogador dois " + guessp2);

            guessp3 = p3.number;
            System.out.println("palpite do jogador tres " + guessp3);

            // Verifica o palpite de cada e corresponde ao " alvo " se um jogador acertar, define a var desse jogado
            // como verdadeira ( deixamos falsa ) ⬇️

            if (guessp1 == targetNumber){
                p1sRight = true;
            }
            if (guessp2 == targetNumber){
                p2sRight = true;
            }
            if (guessp3 == targetNumber){
                p3sRight = true;
            }

            // se o jogador um ou onjogador 2 ou 3 acertrar ( o operado || é o OR = OU )⬇️

            if (p1sRight || p2sRight || p3sRight){
                System.out.println("Temos um ganhador!!!");
                System.out.println(" Jogador numero 1 acerto em cheio? " + p1sRight);
                System.out.println(" Jogador numero 2 acerto em cheio? " + p2sRight);
                System.out.println(" Jogador numero 3 acerto em cheio? " + p3sRight);
                System.out.println("acabou o jogo");
                break; // fim do loop ( se não para ele fica infinito)
            }
            else
            {

                // temos que continuar pois ngm acertou

                // caso contrario, continua executando o loop e solicita aos jogadores um outro numero ⬇️

                System.out.println("Os jogadores terão que tentar novamente.");

            }// fim do if e else
        }//fim do loop
    }//fim do metodo
}//fim da classe