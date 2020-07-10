package by.jonline.module5.task04.dragon;

import java.util.*;

import by.jonline.module5.task04.function.JewelryFabic;
import by.jonline.module5.task04.function.Price;
import by.jonline.module5.task04.function.SortByCost;
import by.jonline.module5.task04.jewelry.Jewelry;
import by.jonline.module5.task04.jewelry.art.*;
import by.jonline.module5.task04.jewelry.gold.*;
import by.jonline.module5.task04.jewelry.gemstone.*;
import by.jonline.module5.task04.jewelry.silver.*;

public class Dragon { // владеет сундуком с драгоценностями и управляет им. 
	
    private JewelryFabic jf;
    private int maxJew;
    private int money;
    private List<Jewelry> chest; //сундук
    private List<Jewelry> jewelries; //здесь временно хранятся сортированные драгоценности.
    private List<Class<? extends Jewelry>> jClasses = new ArrayList<>(
    		Arrays.asList(
            Artifact.class, Painting.class, Gemstone.class, 
            Adornment.class, GoldBar.class, GoldCoin.class, 
            SilverBar.class, SilverCoin.class, Silverware.class)
    );


    public Dragon (int maxJew){
    	
        Price price = new Price(jClasses);
        this.jf = new JewelryFabic(jClasses);
        this.maxJew=maxJew;
        this.chest=new ArrayList<Jewelry>();
        this.jewelries = new ArrayList<Jewelry>();
        
    }

    private boolean addJewelryToChest(Jewelry jewelry) {  // добавляем в сундук элемент.
    	
        if (chest.size() < maxJew) {
            chest.add(jewelry);
            return true;
        } else return false;
        
    }
    public void fillChest () { // наполняем сундук до определенного количества. 
    	
        while(true) {
            Jewelry jewelry = getJewelry();
            if (!addJewelryToChest(jewelry)){
                break;
            }
            money += jewelry.getCost();
        }
    }

    private String getOutput(List<Jewelry> jew) { // преобразуем в строку данные об украшениях указанного листа.
    	
        String result = "\nOutput:\n";
        
        for (Jewelry jj : jew) {
            result += jj.toString() + "\n";
        }
        result += getResult(jew);
        return result;
        
    }

    private String getResult(List<Jewelry> jew) {
    	
        return "\nUsed money: " + getTotalCost(jew) +
                "\nUsed jewelries: " + jew.size() +
                " of total: " + maxJew;
        
    }

    private double getTotalCost(List<Jewelry> jew) {
    	
        double result = 0;
        for (Jewelry jj : jew) {
            result += jj.getCost();
        }
        return result;
        
    }

    private Jewelry getJewelry() {return jf.getRandomJewelry();}
    public String getOutput() { return getOutput(chest); }
    public String getResult() {return getResult(chest); }
    public void sortByCost() {chest.sort(new SortByCost());}

    public String getByTotalAmount (double totalAmount) {
    	
        this.jewelries.clear();
        this.sortByCost();
        
        for (Jewelry jj : chest) {
        	
            if (jj.getCost() <=totalAmount) {
                jewelries.add(jj);
                totalAmount-=jj.getCost();
            }
        }
        return getOutput(jewelries);
    }
    
    public void showTheMostExpensiveJew () {
    	
    	double maxcost = 0;
    	
    	for (Jewelry jj : chest) {
    		if (jj.getCost()>maxcost) {
    			maxcost = jj.getCost();
    		}
    	}
    	
    	for (Jewelry jj : chest) {
    		if (jj.getCost()==maxcost) {
    			System.out.println("The most expensive type of jewelry: ");
    			System.out.println(jj);
    			return;
    		}
    	}
    	
    }
}
