package demon_1;

/**
 * Created by apple on 17/3/25.
 */
public class main {

    public static void main(String[] args) {
        Door door = new TimeDoor();
        Timer timer = new Timer();
        timer.register(10,door);
    }
}
