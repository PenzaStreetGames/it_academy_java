package penzastreet.com.task_2.part_2;

public class Time {
    int hour, min, sec;

    public Time(int sec) {
        this.sec = sec % 60;
        this.min = sec / 60 % 60;
        this.hour = sec / 3600;
    }

    public String toString() {
        return hour + ":" + min + ":" + sec;
    }
}
