import java.util.Random;
import java.util.Scanner;

/*
Создайте новый проект GuessTheNumber. Напишите в нём программу-игру,
в которой пользователь будет угадывать некое число, а программа, если он не угадал, будет сообщать ему,
больше или меньше введённое им число, чем загаданное.
В начале программы создайте переменную int с именем value, в которой будет храниться угадываемое число.
Напишите бесконечный цикл с использованием оператора while, в котором вы будете получать введённое
пользователем число из консоли.
Напишите проверку этого числа: если число равно загаданному, выводите в консоль сообщение «Вы угадали!» и з
авершайте цикл.
Если пользователь не угадал число, выводите в консоль подсказку: больше или меньше введённое число, чем загаданное.
 */
public class Main {
    public static void main(String[] args) {
        int value = new Random().nextInt(100);

        while (true) {
            System.out.print("Введите ваше число: ");
            int attempt = new Scanner(System.in).nextInt();

            if (attempt == value) {
                System.out.println("Вы угадали!");
                break;
            } else if (attempt < value) {
                System.out.println("Загаданное число больше.");
            } else {
                System.out.println("Загаданное число меньше.");
            }
        }
    }
}