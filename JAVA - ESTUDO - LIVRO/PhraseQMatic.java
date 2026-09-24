public class PhraseQMatic {
    public static void main(String[] args) {

        // crie tres conjuntos de palavras q serão selecionadas
        //adcione as palavras que bem entender

        String[] wordListOne = {
                "Impressionante","Sinal","fale","mal","de","mim",
                "Pro","Seu","Ex","Fracassado","Eu","já","cansei",
                "de","pedir","desculpas"
        };
        String[] wordListTwo = {
                "Acho","Que","Voce","Me","Conhece","tão","Mal",
                "Ainda","To","Exatamente","onde","voce","meee",
                "deixou","Jovens","perdidos"
        };
        String[] wordListThree = {
                "Na","Noite","Drunk","text","me","Falei","Love",
                "Stereo","Blaxk","and","Yellow","Like","A","G6",
                "lOVE","ME","ONE","TIME"
        };

        // Descubra Quantas Palavra Estão em cada linha

        int oneLen = wordListOne.length;
        int twoLen = wordListTwo.length;
        int threeLen = wordListThree.length;

        // Gere Três Numeros aleatorios

        java.util.Random randomGenerator = new java.util.Random();

        int rand1 = randomGenerator.nextInt(oneLen);
        int rand2 = randomGenerator.nextInt(twoLen);
        int rand3 = randomGenerator.nextInt(threeLen);

        // Crie uma Frase

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        // Exiba uma frase

        System.out.println("Precisamos de " + phrase);
    }
}