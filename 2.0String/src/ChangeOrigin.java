/**
 * Created by FF on 2014/11/7.
 */
public class ChangeOrigin {
    OneString obj;
    public void ch(String s,String m,OneString obj){
        if(m.equals("Upper")){
            this.obj=new Upper(obj);
            this.obj.ostr(s);
        }
        else if (m.equals("Lower")){
            this.obj=new Lower(obj);
            this.obj.ostr(s);
        }
        else if (m.equals("Delete")){
            this.obj =new Delete(obj);
            this.obj.ostr(s);
        }
        else{
            System.out.println("Input Error!");
        }
    }
}
