package Student;

import Arrival.ArrivalStrategy;

public abstract class Student {
    protected ArrivalStrategy arrivalStrategy;

    public void setArrivalStrategy(ArrivalStrategy strategy) {
        this.arrivalStrategy = strategy;
    }

    public void arriveAtUniversity() {
        if (arrivalStrategy != null) {
            arrivalStrategy.arrive();
        }
    }

    public abstract String getType();

    public String getAbilities() {
        return "Обикновен студент";
    }
}