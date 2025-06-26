import java.util.Scanner;

//Напишите программу, которая будет считать факториал переданного в консоли числа.
//Факториал целого числа — это произведение этого целого числа на все целые положительные числа меньше него.
//Обозначается восклицательным знаком. Вот примеры расчётов факториала для некоторых чисел
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число");
        int value = new Scanner (System.in).nextInt();

        if (value < 0) {
            System.out.println("Факториал не определяется для отрицательных чисел");
        } else {
            int factorial = 1;

            for (int i = 1; i <= value; i++) {
                factorial *= i;
                System.out.println(factorial);
            }
        }
    }
}