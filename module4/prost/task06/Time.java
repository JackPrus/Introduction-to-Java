package by.jonline.module4.prost.task06;

public class Time {

    private int hour;
    private int min;
    private int sek;

    public Time(int hh, int mm, int ss) {
        hour = hh;
        min = mm;
        sek = ss;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hh) {
        if (hh > 59 || hh < 0) {
            hour = 0;
        } else {
            hour = hh;
        }

    }

    public int getMin() {
        return min;
    }

    public void setMin(int mm) {
        if (mm > 59 || mm < 0) {
            min = 0;
        } else {
            min = mm;
        }
    }

    public int getSek() {
        return sek;
    }

    public void setSek(int ss) {
        if (ss > 59 || ss < 0) {
            sek = 0;
        } else {
            sek = ss;
        }
    }

    public void forvardHour(int n) {
        int forHour = getHour() + n;

        if (forHour<0){
            setSek(0);
            setMin(0);
            setHour(0);
        }else {
            setHour(forHour);
        }
    }

    public void forvardMin(int n) {

        int min;
        int forHour;
        int forMin;

        min = getMin() + n;
        forHour = min / 60;
        forMin = Math.abs(min % 60);

        if (min > 59) {

            setMin(forMin);
            forvardHour(forHour);

        } else if (min < 0) {

            forHour--;
            setMin(60 - forMin);
            forvardHour(forHour);
        } else {
            setMin(min);
        }

    }

    public void forvardSek(int n) {

        int sek;
        int forMin;
        int forSek;

        sek = getSek() + n;
        forMin = sek / 60;
        forSek = Math.abs(sek % 60);

        if (sek > 59) {

            setSek(forSek);
            forvardMin(forMin);

        } else if (sek < 0) {

            forMin--;
            setSek(60 - forSek);
            forvardMin(forMin);
        } else {
            setSek(sek);
        }
    }

    @Override
    public String toString() {
        return "Time = " + hour + ":" + min + ":" + sek;
    }

}
