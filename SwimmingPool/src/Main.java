
//Создайте новый проект и назовите его SwimmingPool.
//Создайте переменную int volume, в которой будет храниться объём бассейна, и установите её равной 1200.
//Представьте, что система наполняет бассейн со скоростью 30 литров в минуту,
//но у бассейна не отключён слив, и через него каждую минуту выливается 10 литров.
//Создайте ещё две переменные, в которых будут храниться эти значения:
//Напишите программу с использованием цикла while, которая рассчитает и
//выведет в консоль время наполнения бассейна с учётом скоростей наполнения и опустошения.
public class Main {
    public static void main(String[] args) {
        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute
        int volume = 1200;
        int currentVolume = 0;
        int time = 0;

        while (currentVolume < volume) {
            currentVolume += fillingSpeed - devastationSpeed;

            if (currentVolume > volume){
                currentVolume = volume;
            }
            time++;
        } System.out.println("Время заполнения " + time);
    }
}