package myPackage;

public class BasketballGame {
	private String firstTeamName;
	private String secondTeamName;
	private int firstTeamScore = 0;
	private int secondTeamScore = 0;
	private String status;
	private boolean checkInput;

	public String getFirstTeamName() {
		return firstTeamName;
	}

	public void setFirstTeamName(String firstTeamName) {
		this.firstTeamName = firstTeamName;
	}

	public String getSecondTeamName() {
		return secondTeamName;
	}

	public void setSecondTeamName(String secondTeamName) {
		this.secondTeamName = secondTeamName;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public boolean getCheckInput() {
		return checkInput;
	}

	public void setCheckInput(boolean checkInput) {
		this.checkInput = checkInput;
	}

	public void checkInputRange(char team, int score) {
		setCheckInput(true);
		if (team == 'a') {
			switch (score) {
			case 1:
				recordOneScore(team);
				break;
			case 2:
				recordTwoScore(team);
				break;
			case 3:
				recordThreeScore(team);
				break;
			default:
				System.out.println("inputScore is not score range Enter again");
				setCheckInput(false);
				break;
			}
		} else if (team == 'b') {
			switch (score) {
			case 1:
				recordOneScore(team);
				break;
			case 2:
				recordTwoScore(team);
				break;
			case 3:
				recordThreeScore(team);
				break;
			default:
				System.out.println("inputScore is not score range Enter again");
				setCheckInput(false);
				break;
			}
		} else {
			System.out.println("team " + team + " is not exist");
			setCheckInput(false);
		}
	}

	public void recordOneScore(char team) {
		if (team == 'a') {
			firstTeamScore += 1;
		} else
			secondTeamScore += 1;
	}

	public void recordTwoScore(char team) {
		if (team == 'a') {
			firstTeamScore += 2;
		} else
			secondTeamScore += 2;
	}

	public void recordThreeScore(char team) {
		if (team == 'a') {
			firstTeamScore += 3;
		} else
			secondTeamScore += 3;
	}

	public void changeStatus() {
		if (status.equals("progress"))
			status = "finished";
		else
			status = "progress";
	}

	public int getTeamScore(char team) {
		if (team == 'a') {
			return firstTeamScore;
		} else
			return secondTeamScore;
	}

	public String getWinningTeam() {
		if (firstTeamScore > secondTeamScore) {
			return firstTeamName + " are winning.";
		} else if (firstTeamScore == secondTeamScore) {
			return firstTeamName + " and " + secondTeamName + " are same";
		} else
			return secondTeamName + " are winning.";
	}

}
