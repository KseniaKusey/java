//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
В новом проекте напишите программу, которая будет выводить заранее заданные возрасты трёх
людей в порядке увеличения — от меньшего к большему.

Создайте проект с именем AgeComparator, создайте в нём класс Main с методом main,
а в нём три переменные типа int с именами vasyaAge, katyaAge и mishaAge, обозначающими возрасты трёх человек

Создайте ещё три переменные типа int с именами min, middle и max,
в которых в результате выполнения кода должны будут оказаться минимальный,
средний и максимальный возрасты соответственно. Пусть изначально они будут равны значению −1,
это позволит вам проверить,
что переменная изменила своё значение в процессе выполнения программы, так как не может быть возраста меньше нуля

Напишите код, который будет заполнять эти переменные, сравнивая возрасты между собой. В коде используйте условные операторы if, else и их комбинацию else if, а также при необходимости булевы операторы “И”, “ИЛИ” и “НЕ”.
Выведите значения переменных min, middle и max в консоль в следующем формате

Код должен работать корректно при изменении значений в переменных vasyaAge, katyaAge и mishaAge на любые от 0 до 120.
 */
public class Main {
    public static void main(String[] args) {
        int vasyaAge = 29;
        int katyaAge = 58;
        int mishaAge = 70;

        int min = -1; // минимальный возраст
        int middle = -1; // средний возраст
        int max = -1; // максимальный возраст

        if (katyaAge == vasyaAge && vasyaAge == mishaAge) {
            min = katyaAge;
            middle = vasyaAge;
            max = mishaAge;
        } else if (katyaAge <= vasyaAge && katyaAge <= mishaAge) {
            min = katyaAge;
            if (vasyaAge <= mishaAge) {
                middle = vasyaAge;
                max = mishaAge;
            } else {
                middle = mishaAge;
                max = vasyaAge;
            }
        } else if (vasyaAge <= katyaAge && vasyaAge <= mishaAge) {
            min = vasyaAge;
            if (katyaAge <= mishaAge) {
                middle = katyaAge;
                max = mishaAge;
            } else {
                middle = mishaAge;
                max = katyaAge;
            }
        } else {
            min = mishaAge;
            if (katyaAge <= vasyaAge) {
                middle = katyaAge;
                max = vasyaAge;
            } else {
                middle = vasyaAge;
                max = katyaAge;
            }
        }
        System.out.println("Minimal age: " + min);
        System.out.println("Middle age: " + middle);
        System.out.println("Maximal age: " + max);
    }
}