import java.util.Scanner;

//Дана последовательность чисел длиной N.
//Найти первое левое вхождение положительного числа x в ней или вывести -1,
//если число x не встречается
public class Main {

    public static int findx(int[] seq, int x) {
        int ans = -1;
        for (int i = 0; i < seq.length; i++) {
            if (seq[i] == x && ans == -1) {
                ans = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        System.out.println(findx(a, x));

    }

}