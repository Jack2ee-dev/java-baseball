import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomNumbers {
    private static int RANDOM_NUMBER_START = 1;
    private static int RANDOM_NUMBER_END = 9;
    private static int RANDOM_NUMBER_SIZE = 3;

    private List<Integer> randomNumbers;

    public RandomNumbers() {
        this.randomNumbers = selectThreeNumbersRandomly(generateNumberListBetweenOneAndNine());
    }

    private List<Integer> generateNumberListBetweenOneAndNine() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = RANDOM_NUMBER_START; i <= RANDOM_NUMBER_END; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    private List<Integer> selectThreeNumbersRandomly(List<Integer> numbers) {
        List<Integer> threeNumbers = new ArrayList<>();
        Collections.shuffle(numbers);
        for (int i = 0; i < RANDOM_NUMBER_SIZE; i++) {
            threeNumbers.add(numbers.get(i));
        }
        return threeNumbers;
    }

    public List<Integer> getRandomNumbers() {
        return this.randomNumbers;
    }
}
