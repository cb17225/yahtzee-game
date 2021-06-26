public class Scoreboard {

	private Score[] scoreboardArray = new Score[13];
	
	public Scoreboard() {
		scoreboardArray[0] = new OnesScore("Ones");
		scoreboardArray[1] = new TwosScore("Twos");
		scoreboardArray[2] = new ThreesScore("Threes");
		scoreboardArray[3] = new FoursScore("Fours");
		scoreboardArray[4] = new FivesScore("Fives");
		scoreboardArray[5] = new SixesScore("Sixes");
		scoreboardArray[6] = new ThreeOfAKindScore("Three of a Kind");
		scoreboardArray[7] = new FourOfAKindScore("Four of a Kind");
		scoreboardArray[8] = new FullHouseScore("Full House");
		scoreboardArray[9] = new SmallStraightScore("Small Straight");
		scoreboardArray[10] = new LargeStraightScore("Large Straight");
		scoreboardArray[11] = new ChanceScore("Chance");
		scoreboardArray[12] = new YahtzeeScore("Yahtzee");	
	}
	
	public void updateScoreboard(int index, int[] valueArray) {
		scoreboardArray[index].calculateScore(valueArray);
		scoreboardArray[index].setUsed();
	}
	
	public boolean checkIfUsed(int index) {
		return scoreboardArray[index].isUsed();
	}
	
	public int getTotalScore() {
		 int total = 0; 
		 for(int i = 0; i < 13; i++) {
			 total += scoreboardArray[i].getValue();
		 }
		 return total;
	}
	
	public Score[] getScoreboardArray() {
		return scoreboardArray;
	}

	public String toString() {
		String returnString = "Scorecard:\n";
		for (int i = 0; i < 13; i++) {
			returnString += String.format("%-25s", scoreboardArray[i].getType() + ": " + scoreboardArray[i].getValue());
			if (i > 0 && i % 4 == 0)
				returnString += "\n";
		}
		returnString += "Total Score: " + this.getTotalScore();
		return returnString;
	}
}
