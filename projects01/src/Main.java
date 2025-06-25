public class Main {
    public static void main (String[] atgs) {
        System.out.println("Система расчета стоимости топлива");

         int fuelTipe = 95;
         int amount = 50 ;
         boolean hasDiscount = amount > 10;

         double fuel92price = 60.2;
         double fuel95price = 67.33;

         double discount = 0.1;

         double fuelPrice = 0;
         if(fuelTipe == 92) {
             fuelPrice = fuel92price;
         } else if (fuelTipe == 95) {
            fuelPrice = fuel95price;
         } else {
             System.out.println("Указан неверный тип топлива");
         }

         if(hasDiscount) {
             fuelPrice = (1 -discount) * fuelPrice;
         }

         if(amount < 1) {
             System.out.println("Казано слишком малое количества топлива");
             amount = 0;
         }

        System.out.println("Цена выбранного топлива: " + fuelPrice +" руб");

        double totalPrice = fuelPrice * amount;
        System.out.println("Общая стоимость заправки: " + totalPrice + " руб");

    }
}
