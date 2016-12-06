import java.util.ArrayList;
import java.util.List;

/**
 * Created by Antoine on 06.12.2016.
 */
public class Ship {

    final int MAX_COUNT = 5;
    private int countBoat;
    private Engine engine = new Engine();
    private Boat[] boats;
    private boolean move;

    public Ship() {}

    public void setEngine(Engine engine) {

        this.engine = engine;
    }

    public void addBoat(Boat... args) {

        if (args.length < MAX_COUNT) {
            this.boats = args;
            countBoat += args.length;
            System.out.println("Добавили " + args.length + " шлюпок на корабль");
        } else System.out.println("Слишком много шлюпок, можно только 5");
    }

    public void downBoat () {
        if (countBoat != 0) {
            countBoat--;
            System.out.println("Спустили одну шлюпку на воду");
        } else System.out.println("Шлюпок больше нет");
    }

    public class Engine {

        public void onOff() {
            move = !move;
            if (move) {
                System.out.println("Двигатель заработал, корабль начал движение");
            } else System.out.println("Двигатель перестал работать, корабль тоже");
        }
    }

    public class Boat {}
}
