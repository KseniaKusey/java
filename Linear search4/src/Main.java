import java.util.Scanner;

//Дана последовательность слов
//Вывести все самые короткие слова
public class Main {

    public static void shortwords(String[] words) {
        int minLen = words[0].length();

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < minLen) {
                minLen = words[i].length();
            }
        }

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == minLen) {
                System.out.println(words[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        String[] words;

        if (args != null && args.length > 0) {
            words = args;
        } else {
            System.out.println("Введите слова, разделённые пробелами:");
            Scanner sc = new Scanner(System.in);
            String line = sc.hasNextLine() ? sc.nextLine().trim() : " ";
            sc.close();

            if (line.isEmpty()) {
                System.out.println("Слова не введены.");
                return;
            }

            words = line.split(" ");
        }

        if (words.length == 0) {
            System.out.println("Слова не введены.");
            return;
        }

        shortwords(words);
    }




    }
