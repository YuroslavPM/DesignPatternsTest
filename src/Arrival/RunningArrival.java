package Arrival;

public class RunningArrival implements ArrivalStrategy {
    @Override
    public void arrive() {
        System.out.println("Пристига с тичане и подскачане.");
    }
}