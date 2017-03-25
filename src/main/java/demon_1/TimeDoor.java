package demon_1;

import javax.sql.DataSource;

/**
 * Created by apple on 17/3/25.
 */
public class TimeDoor implements Door,TimeClient {

    public void lock() {

    }

    public void unlock() {

    }

    public void isDoorOpen() {

    }

    public void echo(int timeout) {
        System.out.println("开门时间过长,超时了 时间为" + timeout);
    }
}
