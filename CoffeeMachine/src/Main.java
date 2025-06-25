//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int coffeAmount = 2330;
        int milkAmount = 3210;
        int skimmedMilkAmount = 1290;

        boolean isBlocked = true;

        int cappuchinoMilkRequired = 60;
        int cappuchinoCoffeerequired = 15;

        boolean milkIsEnough = skimmedMilkAmount >= cappuchinoCoffeerequired || milkAmount >= cappuchinoMilkRequired;
        boolean coffeeIsEnough = coffeAmount >= cappuchinoCoffeerequired;

        if (!isBlocked) {
            System.out.println("Кофе-машина заблокировнана");
        } else if (milkIsEnough && coffeeIsEnough) {
            System.out.println("Готовим кофе");
        } else if (!milkIsEnough) {
            System.out.println("Молока недостаточно");
        } else if (!coffeeIsEnough) {
            System.out.println("Кофе недостаточно");
        }
    }
}
