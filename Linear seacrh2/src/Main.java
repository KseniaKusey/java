import java.util.Scanner;

// Дана последовательность чисел длиной N (N >0)
// Найти максимальное число в последовательности
public class Main {

    public static int findMax(int[] seq) {
        int a = seq[0];

        for(int i = 1 ; i < seq.length; i++) {
            if (seq[i] > a) {
                a = seq[i];
            }
        }
        return a;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] line = new int[n];

        for (int i = 0; i < n; i++) {
            line[i] = sc.nextInt();
        }
        System.out.println(Main.findMax(line));

    }
}
