
public class TwosScore extends Score {
	
	public TwosScore(String s) {
		super(s);
	}
	

	public int calculateScore(int[] values) {	
		int val = this.getValue();
		for (int i = 0; i < 5; i++) {
			if (values[i] == 2) {
				val += values[i];
			}	
		}
		this.setValue(val);
		return val;
	} 
}