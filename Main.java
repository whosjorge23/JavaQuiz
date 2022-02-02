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

    public static void main(String[] args) {
        String q1 = ANSI_BLUE+"What color are apples?\n"+ANSI_RESET
                + "(a) red/green/yellow\n(b) orange\n(c) magenta";
        String q2 = ANSI_BLUE+"What color are bananas?\n"+ANSI_RESET
                + "(a) red/green/\n(b) yellow\n(c) blue";
        String q3 = ANSI_BLUE+"What geometric shape is generally used for stop signs?\n"+ANSI_RESET
                + "(a) square\n(b) octagon\n(c) pentagon";
        String q4 = ANSI_BLUE+"Who named the Pacific Ocean?\n"+ANSI_RESET
                + "(a) Ferdinand Magellan\n(b) Columbus\n(c) Amerigo Vespucci";
        String q5 = ANSI_BLUE+"Which animal can be seen on the Porsche logo?\n"+ANSI_RESET
                + "(a) Trident\n(b) Bull\n(c) Horse";
        String q6 = ANSI_BLUE+"What is the name of the largest ocean on earth?\n"+ANSI_RESET
                + "(a) Atlantic Ocean\n(b) Indian Ocean\n(c) Pacific Ocean";
        String q7 = ANSI_BLUE+"Demolition of the Berlin wall separating East and West Germany began in what year?\n"+ANSI_RESET
                + "(a) 1989\n(b) 1987\n(c) 1991";
        String q8 = ANSI_BLUE+"What is the rarest M&M color?\n"+ANSI_RESET
                + "(a) Yellow\n(b) Red\n(c) Brown";
        String q9 = ANSI_BLUE+"What is the common name for dried plums?\n"+ANSI_RESET
                + "(a) DehydratedPlums\n(b) Prunes\n(c) Dry Plums";
        String q10 = ANSI_BLUE+"What was the first soft drink in space?\n"+ANSI_RESET
                + "(a) Pepsi\n(b) Dr. Pepper\n(c) Coca-Cola";

        Question [] questions = {
                new Question(q1,"a"),
                new Question(q2,"b"),
                new Question(q3,"b"),
                new Question(q4,"a"),
                new Question(q5,"c"),
                new Question(q6,"c"),
                new Question(q7,"a"),
                new Question(q8,"c"),
                new Question(q9,"b"),
                new Question(q10,"c"),
        };

        takeTest(questions);
    }

    public static void takeTest(Question [] questions) {
        int score = 0;
        Scanner keyboardInput = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].prompt);
            String answer = keyboardInput.nextLine();

            if (answer.equals(questions[i].answer)) {
                score++;
                //System.out.println("Correct Answer");
            }else {
                System.out.println(ANSI_YELLOW+"The correct answer is: " + questions[i].answer +ANSI_RESET + "\n");
            }
        }
        keyboardInput.close();
        //System.out.println("You got " + score + "/" + questions.length);
        if (score == questions.length) {
            System.out.println(ANSI_GREEN+"You got " + score + "/" + questions.length + ". You nailed the test."+ANSI_RESET);
        }else if (score <= 9 && score >= 6){
            System.out.println(ANSI_YELLOW+"You got " + score + "/" + questions.length + ". Well done, but you could be better."+ANSI_RESET);
        }else if (score < 5){
            System.out.println(ANSI_RED+"You got " + score + "/" + questions.length + ". Too bad, it is better you try the test again."+ANSI_RESET);
        }
    }
}
