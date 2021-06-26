public class Die {
	
	private int numSides;
	private int currentValue;
	private boolean isHeld;
	
	public Die() {
		isHeld = false;
		numSides = 6; // default 
		roll(); //currentValue is set already
	}
	
	public Die(int sides) {
		isHeld = false;
		numSides = sides;  // can set the number of sides
		roll();
	}

	public Die(int sides, int initialValue) {
		isHeld = false;
		numSides = sides; 
		currentValue = initialValue;
	}
	
	public int roll() {
		currentValue = (int)(Math.random() * numSides + 1);
		return currentValue;
	}
	
	public String toString() {
		return "Num of sides: " + numSides + ", Value: " + currentValue;
	}
	
	public int getCurrentValue() {
		return currentValue;
	}
	
	public void holdDie() {
		isHeld = true;
	}
	
	public void setHold(boolean held) {
		isHeld = held;
	}
	
	public boolean getHoldValue() {
		return isHeld;
	}
	
}
