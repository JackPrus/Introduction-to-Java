package by.jonline.module5.task04.function;

import java.util.Comparator;
import by.jonline.module5.task04.jewelry.Jewelry;

public class SortByCost implements Comparator <Jewelry> {
	
    @Override
    public int compare(Jewelry j1, Jewelry j2) {
    	
        return ((Double)j2.getCost()).compareTo(j1.getCost());
        
    }
}
