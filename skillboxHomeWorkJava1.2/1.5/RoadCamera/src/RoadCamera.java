import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoadCamera {
    public static void main(String[] args) throws IOException {
        //Параметры программы
        int maxOncomingSpeed = 40; // km/h
        int speedFineGrade = 20; // km/h
        int finePerGrade = 500; // RUB
        int criminalSpeed = 180; // km/h

        //=============================================================

        System.out.println("Введите скорость автомобиля:");

        //Скорость автомобиля
        int oncomingSpeed = int.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        if (oncomingSpeed >= criminalSpeed) {
            System.out.println("Текущая скорость: " + oncomingSpeed + " км/ч, вы ехали в интервале "+criminalSpeed+" и выше - Вызов полиции...");
        } else if (oncomingSpeed > maxOncomingSpeed + speedFineGrade) {
            int overSpeed = oncomingSpeed - maxOncomingSpeed;
            int gradesCount = overSpeed / speedFineGrade;
            int fine = finePerGrade * gradesCount * 2;
            int beginSpeed =(maxOncomingSpeed + gradesCount * speedFineGrade + (gradesCount == 1 ?  1 : 0));
            System.out.println("Текущая скорость: " + oncomingSpeed + " км/ч, вы ехали в интервале скорости: " + beginSpeed + "-" +
                    (maxOncomingSpeed + (gradesCount + 1) * speedFineGrade - 1) + " км/ч - Щтраф " + fine+" руб.");
        } else {
            System.out.println("Скорость не превышена");
        }
    }
}