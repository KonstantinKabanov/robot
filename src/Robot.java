/**
 * Created by Костя on 13.01.2017.
 */
public class Robot {
    private String model;

    public void setModel(String model) {
        this.model = model;
    }

    public interface Moveable {
        void moveRight();

        void moveLeft();

        void moveUp();

        void moveDown();
    }
}

