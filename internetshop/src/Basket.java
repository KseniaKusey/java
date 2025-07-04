//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Basket {
    private String items =" ";
    private int totalPrice = 0;
    private int limit;

    public Basket() {
        items ="Список товаров:";
        this.limit = 100000;
    }
    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }


    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }
        if(totalPrice + count * price >= limit) {
            error = true;
        }
        if (error) {
            System.out.println("Error occured");
            return;
        }
        items = items + "\n" + name + " - " + count + " шт. - " + price;
        totalPrice = totalPrice + count * price;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }
    public int getTotalPrice() {
        return totalPrice;
    }
    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}