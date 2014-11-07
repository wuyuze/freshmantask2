/**
 * Created by FF on 2014/11/7.
 */
public class Builder extends Build {
    private Computer com=new Computer();
    public Computer getComputer(){
        return com;
    }
    public void cPart(String display,String host){
        com.cd(display);
        com.ch(host);
    }
}
