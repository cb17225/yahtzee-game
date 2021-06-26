public class FullHouseScore extends Score {

	public FullHouseScore(String s) {
		super(s);
		
	}
	
	public int calculateScore(int[] values) {	
		int val = this.getValue();
		for (int i = 1; i < 7; i++) {
			int counter = 0;
			for (int j = 0; j < 5; j++) {
				if (values[j] == i)
					counter++;
			}
			
			if (counter == 3) {
				int num1 = i;
				int num2 = -1;
				counter = 0;
				for (int k = 0; k < 5; k++) {
					if (values[k] == num1) {
						continue;
					} else {
						if (num2 == -1) {
							num2 = values[k];
							counter++;
						} else if (num2 == values[k]) {
							counter++;
						}
					}
				}
				if (counter == 2) {
					val += 25;
					break;
				}	
			}
		}
		this.setValue(val);
		return val;
	} 
}
