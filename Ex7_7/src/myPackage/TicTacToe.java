package myPackage;

public class TicTacToe {
	private char[][] board = { { '0', '0', '0' }, { '0', '0', '0' }, { '0', '0', '0' } };
	private int turn = 0;

	TicTacToe() {
		System.out.println("Game start!");
		System.out.println("This is each number location game board!!");
		System.out.println(" ________\n|00 01 02|\n|10 11 12|\n|20 21 22|");
	}

	public char[][] getBoard() {
		return board;
	}

	public void addMove(int i, int j, char[][] board) {
		if (i >= 0 && i <= 2 && j >= 0 && j <= 2 && board[i][j] != 'O' && board[i][j] != 'X') {
			if (turn == 0) {
				board[i][j] = 'O';
				turn = 1;
			} else {
				board[i][j] = 'X';
				turn = 0;
			}
		} else
			System.out.println("NOT");
	}

	public void display() {
		for (int i = 0; i < 3; i++) {
			System.out.print("|");
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == '0')
					System.out.print("  ");
				else
					System.out.print(board[i][j] + " ");
			}
			System.out.print("|\n");

		}
	}

	public void isTurn() {
		if (turn == 0)
			System.out.println("O turn");
		else
			System.out.println("X turn");
	}

	public boolean WinnerWho() {
		for (int i = 0; i < 3; i++) {
			if (board[i][0] == 'O' && board[i][1] == 'O' && board[i][2] == 'O') {
				System.out.println("O win");
				return true;
			} else if (board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == 'X') {
				System.out.println("X win");
				return true;
			}
			if (board[0][i] == 'O' && board[1][i] == 'O' && board[2][i] == 'O') {
				System.out.println("O win");
				return true;
			} else if (board[0][i] == 'X' && board[1][i] == 'X' && board[2][i] == 'X') {
				System.out.println("X win");
				return true;
			}
		}
		int sum = 0, sum2 = 0;
		for (int i = 0; i < 3; i++) {
			if (board[i][i] == 'O')
				sum++;
			if (board[i][i] == 'X')
				sum2++;
			if (sum == 3) {
				System.out.println("O win");
				return true;
			}
			if (sum2 == 3) {
				System.out.println("X win");
				return true;
			}
		}

		if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
			System.out.println("O win");
			return true;
		}
		if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
			System.out.println("X win");
			return true;
		}
		return false;
	}

}
