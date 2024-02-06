import java.util.*;

public class Wordle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        Dictionary base = new Dictionary();
        int index = rand.nextInt(0, base.words.size());
        String wordle = base.words.get(index);
        String userWord;

        System.out.println("Welcome to Wordle!");
        System.out.println("Make your first five letter word guess.");
        userWord = scan.nextLine();
        while (userWord.length() != 5) {
            System.out.println("That is not a five letter word! Try again.");
            userWord = scan.nextLine();
        }
        char[] word = wordle.toCharArray();
        char[] user = userWord.toCharArray();

        outer:
        for (int i = 0; i < 5; i++) {
            if (user[i] == word[i]) {
                System.out.print(user[i] + " green");
                break;
            }
            for (int j = 0; j < user.length; j++) {
                if (user[j] == word[i]) {
                    System.out.print(user[i] + " yellow");
                    break;
                }
            }
            System.out.print(user[i] + " grey");
        }
    }
}
