package by.jonline.module5.task04.function;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import by.jonline.module5.task04.jewelry.Jewelry;

public class Price {
	
    private final static String PRICES_PATH = "D://программирование/Проекты/Module5(4)/src/price.txt";
    private static Map<Class<? extends Jewelry>, Double> price;
    private List<Class<? extends Jewelry>> jClasses;

    public Price(List<Class<? extends Jewelry>> jClasses) {

        price = new HashMap<Class<? extends Jewelry>, Double>();
        this.jClasses = jClasses;
        getPriceFromFile();

    }

    private void getPriceFromFile() {

        try(FileInputStream fis = new FileInputStream(PRICES_PATH);){

            Properties properties = new Properties();
            properties.load(fis);

            for (int i=0; i<jClasses.size(); i++){

                Class<? extends Jewelry> classI = jClasses.get(i);
                price.put(classI, Double.parseDouble(properties.getProperty(classI.getSimpleName())));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static double getPrice(Class<? extends Jewelry> jClass) {
        return price.get(jClass);
    }
    
}
