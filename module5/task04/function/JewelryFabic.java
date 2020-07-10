package by.jonline.module5.task04.function;

import java.util.*;
import by.jonline.module5.task04.jewelry.Jewelry;

public class JewelryFabic {
	
    private List<Class<? extends Jewelry>> jClasses;
    private Random rand = new Random(47);

    public JewelryFabic (List<Class<? extends Jewelry>> jClasses){
        this.jClasses=jClasses;
    }

    public Jewelry getRandomJewelry(){
        return genRandomJewelry();
    }

    private Jewelry genRandomJewelry (){
        try {
            return jClasses.get(rand.nextInt(jClasses.size())).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
