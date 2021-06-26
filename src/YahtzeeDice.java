public class YahtzeeDice {
	//instance variables - attributes
	private Die[] dieArray;
	
	// constructor - called when you create new OlympicCircles object
	public YahtzeeDice() {
		dieArray = new Die[5];
		for (int i = 0; i < 5; i++) {
			dieArray[i] = new Die();
		}
	}
	
	public YahtzeeDice(int numSides) {
		dieArray = new Die[5];
		for (int i = 0; i < 5; i++) {
			dieArray[i] = new Die(numSides);
		}
	}
	
	// instance methods - behaviors
	public int roll() {
		int total = 0;
		for (int i = 0; i < dieArray.length; i++) {
			total += dieArray[i].roll();
		}
		return total;
	}
	
	public Die[] getDice() {
		return dieArray;
	}
	
	public int[] getDiceValues() {
		int[] diceValues = new int[5];
		for (int i = 0; i < dieArray.length; i++) {
			diceValues[i] = dieArray[i].getCurrentValue();
		}
		return diceValues;
	}
	
	public void hold(int index) {
		dieArray[index].holdDie();
	}
	
	public boolean checkIfHeld(int index) {
		return dieArray[index].getHoldValue();
	}
	
	public String toString() {
		String returnString = "Five dice with values ";
		for (int i = 0; i < dieArray.length - 1; i++) {
			returnString += (dieArray[i].getCurrentValue() + ", ");
		}
		returnString += dieArray[dieArray.length - 1].getCurrentValue();
		return returnString;
	}
	
	public Die getDie(int index) {
		return dieArray[index];
	}
	
	public void rollDieAt(int index) {
		dieArray[index].roll();
	}
	
	public void reset() {
		for (int i = 0; i < 5; i++) {
			dieArray[i].setHold(false);
		}
	}
}
