import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    static int maxScore = 3;
    static int score;

    public static void main(String[] args) {
        int value = 1;
        Random random = new Random();
        while (value == 1){
            score = 0;
            System.out.println("Угадайте число от 0 до 9");
            int answer = random.nextInt(10);
            boolean isCorrect = guess(answer);
            if (isCorrect){
                System.out.println("Верно!");
            } else {
                System.out.println("Вы проиграли. Правильный ответ " + answer);
            }
            System.out.println("Если хотите сыграть еще раз - нажмите 1, закончить игру - нажмите 0");
            value = readValue();
        }
        System.out.println("Игра окончена");

    }
    static boolean guess(int answer) {
        while (score < maxScore) {
                int userAnswer = readValue();
            if (userAnswer == answer) {
                return true;
            } else if (userAnswer < answer) {
                System.out.println("Вы ввели слишком маленькое число");
                score++;
            } else {
                System.out.println("Вы ввели слишком большое число");
                score++;
            }
        } return false;
    }

    static int readValue() {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Некорректный ввод. Попробуйте еще раз");
        }
        return sc.nextInt();
    }

}

