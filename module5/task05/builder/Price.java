package by.jonline.module5.task05.builder;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import by.jonline.module5.task05.flower.Flower;
import by.jonline.module5.task05.wrap.Wrap;

public class Price {

	//изменить путь при импорте проекта. Файлы в проекте прилагаются.
	
	private final static String FLOWER_PATH = "D://программирование/Проекты/проект5/src/priceOfFlower.txt";
	private final static String WRAP_PATH = "D://программирование/Проекты/проект5/src/priceOfWrap.txt";

	private static double getPriceOfFlowersFromFile(Flower flower) {

		try (FileInputStream fis = new FileInputStream(FLOWER_PATH);) {

			Properties prop = new Properties();
			prop.load(fis);

			double flowerPrice = Double.parseDouble(prop.getProperty(flower.getClass().getSimpleName()));
			return flowerPrice;

		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1000;
	}

	
	private static double getPriceOfWrapFromFile(Wrap wrapClass) {

		try (FileInputStream fis = new FileInputStream(WRAP_PATH);) {
			Properties prop = new Properties();
			prop.load(fis);

			double wrapPrice = Double.parseDouble(prop.getProperty(String.valueOf(wrapClass)));
			return wrapPrice;

		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1000;
	}

	
	public static double getPriceOfWrap(Wrap wrap) {
		return getPriceOfWrapFromFile(wrap);
		}

	
	public static double getPriceOfFlower(Flower flower) {
		return getPriceOfFlowersFromFile(flower);
		}

}