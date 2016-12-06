import java.util.ArrayList;
import java.util.List;

/**
 * Created by Antoine on 06.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        Ship ship = new Ship();
        Ship.Engine engine = ship.new Engine();
        Ship.Boat boat1 = ship.new Boat();
        Ship.Boat boat2 = ship.new Boat();

        ship.setEngine(engine);
        ship.addBoat(boat1, boat2);

        engine.onOff();
        engine.onOff();

        ship.downBoat();
        ship.downBoat();
        ship.downBoat();
    }
}
