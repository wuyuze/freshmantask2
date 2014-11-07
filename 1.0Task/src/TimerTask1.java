import com.sun.javafx.tk.Toolkit;

import java.util.TimerTask;

/**
 * Created by FF on 2014/11/7.
 */
public class TimerTask1 extends TimerTask{
    int i;
    TaskCommand obj=new DoTask();
    public TimerTask1(int i) {
        this.i = i;
    }
    public void run(){
        obj.task(this.i);

    }
}