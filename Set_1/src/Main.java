import java.util.HashSet;
import java.util.Scanner;

//Дана последовательность положительных чисел длинной N и число x.
//Нужно найти два числа различных A и B в последовательности ,
//так что A + B = x или вернуть 0,0, если такой пары нет.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int x = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            int a = arr[i];
            int b = x - a;

            if (set.contains(b)) {
                System.out.println(a + " " + b);
                return;
            }
            set.add(a);
        }
        System.out.println("0, 0");

    }
}
