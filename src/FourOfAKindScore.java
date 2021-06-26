public class FourOfAKindScore extends Score {

	public FourOfAKindScore(String s) {
		super(s);
	}
	
	public int calculateScore(int[] values) {	
		int val = this.getValue();
		for (int i = 1; i < 7; i++) {
			int counter = 0;
			for (int j = 0; j < 5; j++) {
				if (values[j] == i) {
					counter++;
				}
			}
			
			if (counter >= 4) {
				for (int k = 0; k < 5; k++) {
					val += values[k];
				}
				break;
			}
		}
		this.setValue(val);
		return val;
	}  
}


