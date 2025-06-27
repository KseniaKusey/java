/*
Создайте класс Arithmetic с двумя переменными — числами типа int.
Создайте в этом классе конструктор, принимающий два параметра — тоже числа типа int.
В конструкторе сохраняйте переданные параметры в переменных класса.
В созданном классе реализуйте методы, вычисляющие различные величины (значения)
на основе переменных класса, а именно:
сумму чисел;
произведения чисел;
максимальное из двух чисел;
минимальное из двух чисел.
 */
public class Arithmetic {
    private int namber1;
    private int namber2;

    public Arithmetic(int namber1, int namber2) {
        this.namber1 = namber1;
        this.namber2 = namber2;
    }

    public int calculateSum() {
        return namber1 + namber2;
    }

    public int calculateProduct() {
        return namber1 * namber2;
    }

    public int findMax() {
        return Math.max(namber1, namber2);
    }

    public int findMin() {
        return Math.min(namber1, namber2);
    }

    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic(10, 20);

        System.out.println("Сумма: " + arithmetic.calculateSum());
        System.out.println("Произведение: " + arithmetic.calculateProduct());
        System.out.println("Максимальное число: " + arithmetic.findMax());
        System.out.println("Минимальное число: " + arithmetic.findMin());
    }


}
