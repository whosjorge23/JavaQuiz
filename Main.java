import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String q1 = "What color are apples?\n"
                + "(a) red/green/yellow\n(b) orange\n(c) magenta";
        String q2 = "What color are bananas?\n"
                + "(a) red/green/\n(b) yellow\n(c) blue";
        String q3 = "What geometric shape is generally used for stop signs?\n"
                + "(a) square\n(b) octagon\n(c) pentagon";
        String q4 = "Who named the Pacific Ocean?\n"
                + "(a) Ferdinand Magellan\n(b) Columbus\n(c) Amerigo Vespucci";
        String q5 = "Which animal can be seen on the Porsche logo?\n"
                + "(a) Trident\n(b) Bull\n(c) Horse";
        String q6 = "What is the name of the largest ocean on earth?\n"
                + "(a) Atlantic Ocean\n(b) Indian Ocean\n(c) Pacific Ocean";
        String q7 = "Demolition of the Berlin wall separating East and West Germany began in what year?\n"
                + "(a) 1989\n(b) 1987\n(c) 1991";
        String q8 = "What is the rarest M&M color?\n"
                + "(a) Yellow\n(b) Red\n(c) Brown";
        String q9 = "What is the common name for dried plums?\n"
                + "(a) DehydratedPlums\n(b) Prunes\n(c) Dry Plums";
        String q10 = "What was the first soft drink in space?\n"
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
                System.out.println("The correct answer is: " + questions[i].answer + "\n");
            }
        }
        keyboardInput.close();
        //System.out.println("You got " + score + "/" + questions.length);
        if (score == questions.length) {
            System.out.println("You got " + score + "/" + questions.length + ". You nailed the test.");
        }else if (score <= 9 && score >= 6){
            System.out.println("You got " + score + "/" + questions.length + ". Well done, but you could be better.");
        }else if (score < 5){
            System.out.println("You got " + score + "/" + questions.length + ". Too bad, it is better you try the test again.");
        }
    }
}
