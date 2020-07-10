package by.jonline.module4.prost.task04.depo;

import java.util.Comparator;
import by.jonline.module4.prost.task04.train.Train;


public class CompareByTrainNo implements Comparator<Train> {

    @Override
    public int compare(Train t1, Train t2) {
        return t1.gettrainNo()-t2.gettrainNo();
    }
	
}
