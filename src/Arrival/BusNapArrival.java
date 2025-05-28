package Arrival;

public class BusNapArrival implements ArrivalStrategy {
    @Override
    public void arrive() {
        System.out.println("Пристига след спане в автобуса.");
    }
}