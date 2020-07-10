package by.jonline.module5.task05.flower;

public abstract class Flower {

	private String name;

	public Flower(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return '\'' + name + '\'';
	}

}
