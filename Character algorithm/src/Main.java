import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Дана строка с кодировкой UTF-8. Необходимо найти самый часто встречающийся символ


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        HashMap<Character, Integer> dict = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!dict.containsKey(c)) {
                dict.put(c, 0);
            }
            dict.put(c, dict.get(c) + 1);

        }


        char bestChar = ' ';
        int bestCount = 0;

        for (Map.Entry<Character, Integer> entry : dict.entrySet()) {
            if(entry.getValue() > bestCount) {
                bestCount = entry.getValue();
                bestChar = entry.getKey();
            }
        }
        System.out.println(bestChar);
    }
}