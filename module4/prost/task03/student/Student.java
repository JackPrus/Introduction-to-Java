package by.jonline.module4.prost.task03.student;

public class Student {

	private String name;
	private int group;
	private int[] appraisal = new int[5];

	public Student(String name, int group, int [] appraisal) {
		this.name = name;
		this.group = group;
		
		for (int i=0; i<5; i++) {
			this.appraisal[i]=appraisal[i];
		}
		
	}

	public void showGoodStudents() { 

		if (this.checkRating()) {
			System.out.println("Студент-" + this.name + "; Группа: " + this.group);
		}

	}

	public boolean checkRating() { 

		int[] appraisal = this.appraisal;
		
		for (int i = 0; i < appraisal.length; i++) {
			if (appraisal[i] != 9 && appraisal[i] != 10) {
				return false;
			}
		}
		return true;
	}

	
	
}
