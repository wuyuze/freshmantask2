/**
 * Created by FF on 2014/11/7.
 */
public class Lower extends change {
    public Lower(OneString obj){
        super(obj);
    }
    String msg;
    public void lower(String msg1){
        msg=msg1.toLowerCase();
        System.out.println("Lowered string is \n"+this.msg);
    }
    public void ostr(String msg){
        lower(msg);
    }
}
