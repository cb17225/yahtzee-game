public class ThreesScore extends Score {
	
	public ThreesScore(String s) {
		super(s);
	}
	

	public int calculateScore(int[] values) {	
		int val = this.getValue();
		for (int i = 0; i < 5; i++) {
			if (values[i] == 3) {
				val += values[i];
			}	
		}
		this.setValue(val);
		return val;
	} 
}