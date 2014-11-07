import java.util.Scanner;

/**
 * Created by FF on 2014/11/7.
 */
public class Delete extends change {
    public Delete(OneString obj){
        super(obj);
    }
    String msg;
    public void delete(String msg){
        System.out.println("Which liter do you want to delete?");
        Scanner sun =new Scanner(System.in);
        String x = sun.nextLine();
        x.replace("\n","");
        this.msg=msg.replace(x,"");
        System.out.println("Deleted string is "+this.msg);
    }
    public void ostr(String msg){
        delete(msg);
    }
}
