import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * Created by FF on 2014/11/7.
 */
public class TaskTime {
    SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date date1=new Date();
    Date date2=new Date();
    public void getdate2(String i){
        try {
            date2=sdf.parse(i);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
    long time1=date1.getTime();
    long time2=date2.getTime();
    long time=time2-time1;
}
