import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessWord {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("Угадайте, какое слово из \"apple\", \"orange\", \"lemon\", \"banana\", \"apricot\", \"avocado\", \"broccoli\",\n" +
                "                \"carrot\", \"cherry\", \"garlic\", \"grape\", \"melon\", \"leak\", \"kiwi\", \"mango\", \"mushroom\",\n" +
                "                \"nut\", \"olive\", \"pea\", \"peanut\", \"pear\", \"pepper\", \"pineapple\", \"pumpkin\", \"potato\" я загадал");
        int score = 0;
        Random random = new Random();
        int k = random.nextInt(words.length);
        do {
            String userAnswer = readWord();
            StringBuilder correctChar = getFreeStringBuilder();
            int n = Math.min(userAnswer.length(), words[k].length());
            for (int i = 0; i < n; i++) {
                if (userAnswer.charAt(i) == words[k].charAt(i)) {
                    correctChar.setCharAt(i, words[k].charAt(i));
                    score++;
                }
            }
            if (score < words[k].length()){
                System.out.println(correctChar);
            } else {
                System.out.println("Вы угадали слово " + words[k]);
            }
        } while (score < words[k].length());
    }

    public static StringBuilder getFreeStringBuilder() {
        StringBuilder correctChar = new StringBuilder(15);
        for (int i = 0; i < 15; i++) {
            correctChar.append('#');
        }
        return correctChar;
    }

    static String readWord() {
        System.out.println("Введите слово");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
