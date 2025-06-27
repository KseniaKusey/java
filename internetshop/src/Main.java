public class Main {
    public static void main(String[] arg) {
        Basket vasyaBasket = new Basket();
        vasyaBasket.add("Молоко", 80);
        vasyaBasket.add("Хлеб", 30);

        Basket petyaBasket = new Basket(3000);
        petyaBasket.add("Лопата", 500);
        petyaBasket.add("Бочка", 2800);

        Basket mashaBasket = new Basket("Стол", 5000);

        vasyaBasket.print("Корзина Васи: ");
        petyaBasket.print("Корзина Пети: ");
        mashaBasket.print("Корзина Маши: ");

    }
}
