import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInput {
    private static String USER_INPUT_INDICATION = "숫자를 입력해주세요 : ";
    private static String USER_INPUT_VALIDATION_ERROR_MESSAGE = "3자리의 숫자를 띄어쓰기없이 입력해주세요:)";
    private static int USER_INPUT_NUMBER_SIZE = 3;

    public List<Integer> received() {
        String[] stringNumbers = receive().split("");
        List<Integer> parsedToInteger = new ArrayList<>();
        for (int i = 0; i < USER_INPUT_NUMBER_SIZE; i++) {
            parsedToInteger.add(Integer.valueOf(stringNumbers[i]));
        }
        return parsedToInteger;
    }

    private String receive() {
        Scanner scanner = new Scanner(System.in);
        String received = "";
        do {
            System.out.print(USER_INPUT_INDICATION);
            received = scanner.nextLine();
        } while (!validate(received));
        return received;
    }

    private boolean validate(String receivedInput) {
        if (!isTheLengthOfReceivedInputThree(receivedInput) || !ableToParseToInteger(receivedInput)) {
            System.out.println(USER_INPUT_VALIDATION_ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private boolean isTheLengthOfReceivedInputThree(String receivedInput) {
        if (receivedInput.length() != 3) {
            return false;
        }
        return true;
    }

    private boolean ableToParseToInteger(String receivedInput) {
        try {
            Integer.valueOf(receivedInput);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
