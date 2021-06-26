public class YahtzeeScore extends Score {
	
	public YahtzeeScore(String s) {
		super(s);
	}
	
	
	public int calculateScore(int[] values) {	
		int val = this.getValue();
		boolean yahtzee = true;
		int reference = values[0];
		for (int i = 1; i < values.length - 1; i++) {
			if (values[i] != reference) {
				yahtzee = false;
				break;
			}
		}
		if (yahtzee) {
			val += reference * 5;
			this.setValue(val);
		}
		return val;
	} 
}
