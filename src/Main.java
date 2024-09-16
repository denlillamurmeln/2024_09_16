public class Main {
    public static void main(String[] args) {
        int score = calculateScore("Robert", 200);
        System.out.println(score);

        int newScore = calculateScore(300);
        System.out.println(newScore);

        int noPlayer = calculateScore();
    }

    public static int calculateScore(String playername, int score){
        System.out.println("Player " + playername + " score " + score);
        return score * 1000;
    }

    public static int calculateScore(int score){
        //System.out.println("Unknown player score " + score);
        //return score * 1000;
        return calculateScore("Anonymus", score);
    }

    public static int calculateScore() {
        System.out.println("No player, no score");
        return 0;
    }
}