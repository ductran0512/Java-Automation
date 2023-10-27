package lab_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static lab_09.AnimalWithBuilder.Builder;

public class TestAnimalController {

    public static void main(String[] args) {
        Builder builder = new Builder();
        AnimalWithBuilder eagle = builder
                .setName("Eagle")
                .setMaxSpeed(100)
                .setFlyable(true)
                .build();
        AnimalWithBuilder falcon = builder
                .setName("Falcon")
                .setMaxSpeed(150)
                .setFlyable(true)
                .build();
        AnimalWithBuilder tiger = builder
                .setName("Tiger")
                .setMaxSpeed(80)
                .setFlyable(false)
                .build();
        AnimalWithBuilder snake = builder
                .setName("Snake")
                .setMaxSpeed(50)
                .setFlyable(false)
                .build();
        List<AnimalWithBuilder> animalWithBuilderList = new ArrayList<>(Arrays.asList(eagle, falcon, tiger, snake));
        AnimalWithBuilder winner = AnimalController.getWinner(animalWithBuilderList);
        System.out.print("Winner is: " + winner.getName());
        System.out.print(", with speed: " + winner.getSpeed());
    }
}