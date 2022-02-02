import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_LIGHT_YELLOW = "\u001B[93m";

    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BOLD = "\u001B[1m";
    public static final String ANSI_UNBOLD = "\u001B[21m";
    public static final String ANSI_UNDERLINE = "\u001B[4m";
    public static final String ANSI_STOP_UNDERLINE = "\u001B[24m";
    public static final String ANSI_BLINK = "\u001B[5m";

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
	    String secretWord = "java";
        String guess = "";
        int guessCount = 0;
        int guessLimit = 10;
        boolean outOfGuesses = false;
        int colorAttempt;

        while (!guess.equals(secretWord) && !outOfGuesses) {
            colorAttempt = (guessLimit - guessCount);
            if (guessCount < guessLimit) {
                if (colorAttempt <= 10 && colorAttempt >=8){
                    System.out.println(ANSI_GREEN + "ATTEMPT LEFT: " + ANSI_RESET + (guessLimit - guessCount));
                }else if (colorAttempt < 8 && colorAttempt >3){
                    System.out.println(ANSI_YELLOW + "ATTEMPT LEFT: " + ANSI_RESET + (guessLimit - guessCount));
                }else {
                    System.out.println(ANSI_RED + "ATTEMPT LEFT: " + ANSI_RESET + (guessLimit - guessCount));
                }

                System.out.println("Enter a guess for programming language: ");
                guess = keyboardInput.nextLine().toLowerCase();
                guessCount++;
            }else {
                outOfGuesses = true;
            }
        }
        if (outOfGuesses) {
            System.out.println(ANSI_RED +"You Lose! You are out of guesses."+ ANSI_RESET);
        }else {
            System.out.println(ANSI_GREEN +"You Win!"+ ANSI_RESET);
        }
    }
}
