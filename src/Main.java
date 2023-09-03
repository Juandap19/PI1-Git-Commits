import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            //FOR INUTIL
            System.out.println(i);
        }
        System.out.println("Hello world!");
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            cars.add(new Car(true, i));
        }
        System.out.println(cars);
    }
}