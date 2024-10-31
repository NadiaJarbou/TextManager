import java.util.Scanner;

public class ReadUserInput {

    public ReadUserInput() {}

    public void read() {
        CountLinesAndChars textAndLines = new CountLinesAndChars();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your text (write 'stop' to quit): ");
            String input = scanner.nextLine(); // save user input in the variable input

            //check if user input= stop
            if(textAndLines.isStop(input)) {
                break;
            }

            // check if user input not empty
            if (input != "") {
                textAndLines.setText(input);
                textAndLines.setLines();
            }
        }

        System.out.println("Your results:");
        System.out.println("---------------------------");
        System.out.println("Your entered: " + textAndLines.getText());
        System.out.println("Number of lines: " + textAndLines.getLines());
        System.out.println("Number of words: " + textAndLines.getWords());
        System.out.println("Longest word is: " + textAndLines.getLongestWord());
        System.out.println("Number of characters: " + textAndLines.getChars());

        scanner.close();
    }
}
