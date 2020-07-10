package by.jonline.module4.prost.task04.train;

public class Train {
	
    private String destinationPoint;
    private int trainNo;
    private String depTime;

    public Train(int trainNO, String destinationPoint, String depTime) {

        this.trainNo = trainNO;
        this.destinationPoint = destinationPoint;
        this.depTime = depTime;

    }

    public int gettrainNo() { return trainNo; }
    public String getdestinationPoint() { return destinationPoint; }
    public String getdepTime() { return depTime; }

     @Override
     public String toString() {
         return "Train///" +
                 "Номер поезда:" + trainNo +"; "+
                 "Пункт назначения:" + destinationPoint +"; "+
                 "Отправление: " + depTime;
     }



}
