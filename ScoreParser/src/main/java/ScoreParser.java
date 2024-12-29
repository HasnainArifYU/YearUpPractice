import java.util.Arrays;
import java.util.Scanner;

public class ScoreParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the score: ");
        String Score = scanner.nextLine();
        String[] pieces = Score.split("\\|");
        //System.out.println(Arrays.toString(pieces));

        String scoreString = pieces[1];
        String[] scorePieces = scoreString.split(",");
        int team1Score = Integer.parseInt(scorePieces[0]);
        int team2Score = Integer.parseInt(scorePieces[1]);
        String[] teamPieces = pieces[0].split(",");
        String team1 = teamPieces[0];
        String team2 = teamPieces[1];
        if (team1Score > team2Score) {
            System.out.println("the winner is " + team1);
        } else if (team1Score < team2Score) {
            System.out.println("the winner is " + team2);
        } else {
            System.out.println("It's a tie");
        }


    }
}
