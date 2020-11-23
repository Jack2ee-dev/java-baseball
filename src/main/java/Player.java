import java.util.List;

public class Player {
    private List<Integer> playerNumbers;

    public Player(List<Integer> numbers) {
        this.playerNumbers = numbers;
    }

    public List<Integer> getPlayerNumbers() {
        return this.playerNumbers;
    }
}
