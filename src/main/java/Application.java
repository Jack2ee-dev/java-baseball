public class Application {
    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        System.out.println(randomNumbers.getRandomNumbers());
        UserInput userInput = new UserInput();
        Player player = new Player(userInput.received());
        System.out.println(player.getPlayerNumbers());
    }
}
