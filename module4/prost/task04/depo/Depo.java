package by.jonline.module4.prost.task04.depo;

import java.util.Arrays;

import by.jonline.module4.prost.task04.train.Train;


public class Depo {

    private Train [] trains;

    public Train[] getTrains() {
        return trains;
    }

    public void setTrains(Train... train) {
        this.trains = train;
    }

    public void sortByTrainNo(){
        Arrays.sort(this.trains,new CompareByTrainNo());
    }

    public void sortByDestination(){
        Arrays.sort(this.trains,new CompareByDestination());
    }
    public void print (){
        for (Train t : trains){
            System.out.println(t);
        }
    }
    public void infoByNumber(int number){
        for (Train t : trains){
            if (t.gettrainNo()==number){
                System.out.println(t);
                return;
            }
        }
        System.out.println("Такого номера \""+number+"\" нет в списке поездов");
    }
	
}
