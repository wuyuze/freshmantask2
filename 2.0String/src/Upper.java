/**
 * Created by FF on 2014/11/7.
 */
public class Upper extends change {
    public Upper(OneString obj){
        super(obj);
    }
    String msg;
    public void upper(String msg){
        this.msg=msg.toUpperCase();
        System.out.println("Uppered string is \n"+this.msg);
    }
    public void ostr(String msg){
        upper(msg);
    }
}
