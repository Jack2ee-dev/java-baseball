import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomNumbers {
    List<Integer> randomNumbers;

    public RandomNumbers() {
        this.randomNumbers = selectThreeNumbersRandomly(generateNumberListBetweenOneAndNine());
    }

    private List<Integer> generateNumberListBetweenOneAndNine() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    private List<Integer> selectThreeNumbersRandomly(List<Integer> numbers) {
        List<Integer> threeNumbers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Collections.shuffle(numbers);
            threeNumbers.add(numbers.get(0));
            numbers.remove(0);
        }
        return threeNumbers;
    }

    public List<Integer> getRandomNumbers() {
        return this.randomNumbers;
    }

    @Override
    public String toString() {
        return this.randomNumbers.toString();
    }
}
