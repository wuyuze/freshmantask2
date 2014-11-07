/**
 * Created by FF on 2014/11/7.
 */
public class Computer {
    private String display;
    private String host;
    public void cd(String display){
        this.display=display;
    }
    public void ch(String host){
        this.host=host;
    }
    public void showComputer(){
        System.out.println("Display "+this.display );
        System.out.println("Host "+this.host);
    }
}
