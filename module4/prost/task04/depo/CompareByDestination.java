package by.jonline.module4.prost.task04.depo;

import java.util.Comparator;
import by.jonline.module4.prost.task04.train.Train;



public class CompareByDestination implements Comparator<Train> {

	@Override
    public int compare(Train tr1, Train tr2) {

        String departure1 = tr1.getdestinationPoint();
        String departure2 = tr2.getdestinationPoint();

        String time1 = tr1.getdepTime();
        String time2 = tr2.getdepTime();

        int result = departure1.compareTo(departure2);

        if (result == 0) {
            result = time1.compareTo(time2);
        }
        return result;
    }
	
}