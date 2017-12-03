
public class Email {
	private boolean isSpam;
	private String wordsContained;
	public Email(boolean isSpam, String wordsContained) {
		super();
		this.isSpam = isSpam;
		this.wordsContained = wordsContained;
	}
	public boolean isSpam() {
		return isSpam;
	}
	public void setSpam(boolean isSpam) {
		this.isSpam = isSpam;
	}
	public String getWordsContained() {
		return wordsContained;
	}
	public void setWordsContained(String wordsContained) {
		this.wordsContained = wordsContained;
	}

}
