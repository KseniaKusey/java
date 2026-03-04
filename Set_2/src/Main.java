import java.util.HashSet;
import java.util.Scanner;

// Дан словарь из N слов, длина каждого не превосходит K.
// В записи каждого из M слов текста (каждое длиной до K) может быть пропущена одна буква.
// Для каждого слова сказать, входит ли оно (возможно , с одной пропущенной буквой), в словарь.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        HashSet<String> valid = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String word = sc.next();

            valid.add(word);

            for (int j = 0; j < word.length(); j++) {
                String modified = word.substring(0, j) + word.substring(j + 1);
                valid.add(modified);
            }
        }
        for( int i = 0; i < M; i++) {
            String  textWord = sc.next();

            if (valid.contains(textWord)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}