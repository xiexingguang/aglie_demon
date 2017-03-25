package demon_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by spencer on 17/3/25.
 */
public class Timer {

    private static final List<TimeClient> CLIENTS = new ArrayList<TimeClient>();
    private int timetout;

    public void register(int timeout, TimeClient timeClient) {
        CLIENTS.add(timeClient);
        this.timetout = timeout;
        do {
            try {
                Thread.sleep(1000);
                System.out.println(timeout+"s");
                timeout--;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }while (timeout > 0);
        notify_timeDoor();
     }

    public void notify_timeDoor() {
        for (TimeClient timeClient : CLIENTS) {

            timeClient.echo(timetout);
        }
    }

}
