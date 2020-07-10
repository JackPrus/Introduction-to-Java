package by.jonline.module5.task04.jewelry;

import by.jonline.module5.task04.function.Price;

public abstract class Jewelry {
	
    private double cost;
    private String name;

    public Jewelry (String name){
        this.cost= Price.getPrice(this.getClass());
        this.name=name;
    }

    public double getCost() { return cost; }
    public String getName() { return name; }

    @Override
    public String toString() { return "( "+name + " : " + cost + " )"; }
}
