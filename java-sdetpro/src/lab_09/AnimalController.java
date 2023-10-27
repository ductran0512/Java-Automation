package lab_09;

import java.util.ArrayList;
import java.util.List;

public class AnimalController {
    private static List<AnimalWithBuilder> getFilterAnimal(List<AnimalWithBuilder> animalWithBuilderList) {
        List<AnimalWithBuilder> filteredAnimal = new ArrayList<>();
        for (AnimalWithBuilder animalWithBuilder : animalWithBuilderList) {
            if (!animalWithBuilder.isFlyable()) {
                filteredAnimal.add(animalWithBuilder);
            }
        }
        return filteredAnimal;
    }

    public static AnimalWithBuilder getWinner(List<AnimalWithBuilder> animalWithBuilderList) {
        animalWithBuilderList = getFilterAnimal(animalWithBuilderList);
        AnimalWithBuilder winner = animalWithBuilderList.get(0);
        for (AnimalWithBuilder animalWithBuilder : animalWithBuilderList) {
            if (animalWithBuilder.getSpeed() > winner.getSpeed()) {
                winner = animalWithBuilder;
            }
        }
        return winner;
    }
}