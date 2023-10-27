package lab_10;

import java.util.Arrays;
import java.util.List;

public class TestRacingController {
    public static void main(String[] args) {
        final int HORSE_MAX_SPEED = 75;
        final int TIGER_MAX_SPEED = 100;
        final int DOG_MAX_SPEED = 60;
        List<Animal> animalList = Arrays.asList(new Horse(HORSE_MAX_SPEED), new Tiger(TIGER_MAX_SPEED), new Dog(DOG_MAX_SPEED));
        Animal winner = RacingController.getWinner(animalList);
        System.out.print("Winner is: " + winner.getName());
        System.out.print(", with speed: " + winner.getSpeed());

    }
}
