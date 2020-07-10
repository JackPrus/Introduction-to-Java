package by.jonline.module4.agregation.task1.component;

public class Sentence {

	private String sentence = "";

	public Sentence(String s) {  // предложение можно написать с нуля
		sentence += s + ' ';
	}
	
	public Sentence (Word... word) { // а можно составить из слов. 
		for (int i=0; i<word.length; i++) {
			sentence+= word[i].getWord();
		}
	}

	public String getSent() {
		return sentence;
	}

}
