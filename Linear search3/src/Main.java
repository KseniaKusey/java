import java.util.Scanner;

//Дана последовательность чисел длиной N (N >1)
//Найти максимальное число в последовательности и второе по величине
//Такое , которое будет макс ,если вычеркнуть из последовательности одно макс
public class Main {
    public static int[] findMax2(int[] seq){
        int max1 = Math.max(seq[0], seq[1]);
        int max2 = Math.min(seq[0], seq[1]);

        for (int i = 2; i < seq.length; i++) {
            if (seq[i] > max1) {
                max2 = max1;
                max1 = seq[i];
            } else if (seq[i] > max2) {
                max2 = seq[i];
            }
        }
        return new int[]{max1, max2};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] res = findMax2(a);

        System.out.println(res[0] + " " + res[1]);



    }
}