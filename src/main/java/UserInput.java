import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInput {
    private static String USER_INPUT_INDICATION = "숫자를 입력해주세요 : ";
    private static String USER_INPUT_VALIDATION_ERROR_MESSAGE = "3자리의 숫자를 띄어쓰기없이 입력해주세요:)";
    private static int USER_INPUT_NUMBER_SIZE = 3;

    private List<Integer> userInput;

    public UserInput() {
        this.userInput = parse();
    }

    private String receive() {
        Scanner scanner = new Scanner(System.in);
        String received = "";
        System.out.print(USER_INPUT_INDICATION);
        received = scanner.nextLine();
//        do {
//            System.out.print(USER_INPUT_INDICATION);
//            received = scanner.nextLine();
//        } while (validate(received));
        return received;
    }

    private List<Integer> parse() {
        String[] stringNumbers = receive().split("");
        List<Integer> parsedToInteger = new ArrayList<>();
        for (int i = 0; i < USER_INPUT_NUMBER_SIZE; i++) {
            parsedToInteger.add(Integer.valueOf(stringNumbers[i]));
        }
        return parsedToInteger;
    }

    private boolean validate(String receivedInput) {
        if (!isTheLengthOfReceivedInputThree(receivedInput) || !ableToParseToInteger(receivedInput)) {
            return false;
        }
        return true;
    }

    private boolean isTheLengthOfReceivedInputThree(String receivedInput) {
        if (receivedInput.length() != 3) {
            throw new IllegalArgumentException(USER_INPUT_VALIDATION_ERROR_MESSAGE);
        }
        return true;
    }

    private boolean ableToParseToInteger(String receivedInput) {
        try {
            Integer.valueOf(receivedInput);
        } catch (Exception e) {
            throw new IllegalArgumentException(USER_INPUT_VALIDATION_ERROR_MESSAGE);
        }
        return true;
    }

    public String getUserInput() {
        return this.userInput.toString();
    }
}
