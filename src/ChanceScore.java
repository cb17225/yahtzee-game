public class ChanceScore extends Score {
	
	public ChanceScore(String s) {
		super(s);
	}
	
	public int calculateScore(int[] values) {	
		int val = this.getValue();
		for (int i = 0; i < 5; i++) {
			val += values[i];
		}
		this.setValue(val);
		return val;
	} 
}
