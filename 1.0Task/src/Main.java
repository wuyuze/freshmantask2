import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by FF on 2014/11/7.
 */
public class Main {
    public static void main(String[] args){
        System.out.println("You can do :\nTask1\nTask2\nTask3\n Which do you want to do? Input Number!");
        Scanner sun =new Scanner(System.in);
        final int i =sun.nextByte();
        System.out.println("When do you want to excute? eg.2014-5-2 13:00:33");
        sun=new Scanner(System.in);
        String time =sun.nextLine();
        TaskTime tasktime =new TaskTime();
        tasktime.getdate2(time);
        Timer t=new Timer();
        TimerTask1 h=new TimerTask1(i);
        t.schedule(h,tasktime.time);
        t.cancel();
    }
}
