package myPackage;

import java.util.Scanner;

public class TicTacToeDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TicTacToe game = new TicTacToe();
		while (true) {
			System.out.println("Enter location value: (ex: 0 0 )");
			int i = sc.nextInt();
			int j = sc.nextInt();
			game.addMove(i, j, game.getBoard());
			game.display();
			if (game.WinnerWho()) {
				break;
			}
		}
		sc.close();
	}

}
