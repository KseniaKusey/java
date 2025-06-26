import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число");
        int value = new Scanner(System.in).nextInt();

        for (int i  = 1; i <= value; i++){
            if (value % i == 0) {
                int j = value / i;
                System.out.println(i + "*" + j);
            }
        }
    }
}