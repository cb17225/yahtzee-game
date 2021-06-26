public abstract class Score {
	
	private String type;
	private int value;
	private boolean used;
	
	public Score (String input) {
		this.type = input;
		this.value = 0;
		this.used = false;
	}
	
	public abstract int calculateScore(int[] values);
	
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean isUsed() {
		return this.used;
	}

	public void setUsed() {
		this.used = true;
	}
}
