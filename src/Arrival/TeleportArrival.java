package Arrival;

public class TeleportArrival implements ArrivalStrategy {
    @Override
    public void arrive() {
        System.out.println("Пристига чрез телепортация.");
    }
}