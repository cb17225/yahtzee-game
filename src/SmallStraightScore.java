import java.util.Arrays;

public class SmallStraightScore extends Score {
	
	public SmallStraightScore(String s) {
		super(s);
	}
	
	
	public int calculateScore(int[] values) {	
		int val = this.getValue();
		Arrays.sort(values);
		int n = 0; //counter
		boolean combinationWorks = false;

		for (int i = 0; i < 4; i++) {
			if (values[i] + 1 == values[i + 1]) {
				n++;
			} else if (values[i + 1] == values[i]) {
				continue;
			} else {
				n = 0;
			}
			
			if (n == 3) {
		  		combinationWorks = true;
		  		break;
			}
		}

		if (combinationWorks) {
			val += 30; 
		}
		
		this.setValue(val);
		return val;
	} 
}
