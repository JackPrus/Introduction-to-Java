package by.jonline.module4.agregation.task1.component;

public class Text {

	private String title;
	private String text="";

	public Text(String title) {
		this.title = title;
	}
	
	public void addWord (Word... w) {
		for (Word qq : w) {
			text += qq.getWord();
		}
	}
	
	public void addSent (Sentence... s) {
		for (Sentence qq : s) {
			text+= qq.getSent();
		}
	}

	public void print() {
		System.out.println(this);
	}
	
	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return text;
	}

}
