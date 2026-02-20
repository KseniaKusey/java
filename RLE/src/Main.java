import java.util.Scanner;

//Дана строка (возможно, пустая), состоящая из букв A-Z:
//AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB
//Нужно написать функцию RLE, которая на выходе даст строку вида:
//A4B3C2XYZD4E3F3A6B28. И сгенерирует ошибку, если на вход пришла невалидная строка.
//Пояснения: Если символ встречается 1 раз, он остается без изменений;
//Если символ повторяется более 1 раза, к нему добавляется количество повторений.
public class Main {

    public static  String rle(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Input string is null");
        }

        if (s.isEmpty()) {
            return  " ";
        }

        if (!s.matches("[A-Z]+")){
            throw new IllegalArgumentException("Invalid input string. Only A-Z allowed");
        }

        StringBuilder result = new StringBuilder();

        char lastChar = s.charAt(0);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar == lastChar) {
                count++;
            } else {
                appendPacked(result, lastChar, count);
                lastChar = currentChar;
                count = 1;
            }
        }

        appendPacked(result, lastChar, count);

        return result.toString();
    }

    private static void appendPacked(StringBuilder sb, char ch, int count) {
        sb.append((ch));
        if (count > 1) {
            sb.append(count);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();
        System.out.println(rle(ans));

    }
}