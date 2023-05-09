package study.race.domain;

import java.util.ArrayList;
import java.util.List;

public class CarEntry {

    private Car car;
    private List<Integer> moveRecord;

    public CarEntry(Car car) {
        this.car = car;
        this.moveRecord = new ArrayList<>();
    }

    public Car getCar() {
        return car;
    }

    public String getEntryName() {
        return car.getName();
    }

    public List<Integer> getMoveRecord() {
        return moveRecord;
    }

    public void move(int condition) {
        if (canMove(condition)) {
            car.move();
        }
        moveRecord.add(car.getScore());
    }

    public boolean isAboveScore(int maxScore) {
        return car.getScore() >= maxScore;
    }

    private boolean canMove(int condition) {
        return condition >= 4;
    }
    
}