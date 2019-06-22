package myPackage;

import java.util.*;

public class BasketballGameDemo {
	public static void main(String[] args) {
		BasketballGame game = new BasketballGame();
		Scanner sc = new Scanner(System.in);
		game.setFirstTeamName("Cat");
		game.setSecondTeamName("Dogs");
		game.setStatus("progress");
		while (true) {
			System.out.println("Enter a score: (if you want to finish, input score = -1)");
			char team = sc.next().charAt(0);
			int score = sc.nextInt();
			if (score == -1) {
				break;
			}
			game.checkInputRange(team, score);
			if (game.getCheckInput()) {
				System.out.print(game.getFirstTeamName() + " " + game.getTeamScore('a') + ", "
						+ game.getSecondTeamName() + " " + game.getTeamScore('b') + "; ");
				System.out.println(game.getWinningTeam());
			}
		}
		game.changeStatus();
		System.out.println("game is " + game.getStatus());
		sc.close();
	}
}
