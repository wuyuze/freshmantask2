import java.util.Scanner;

/**
 * Created by FF on 2014/11/7.
 */
public class Director {
    private Build builder =new Builder();
    public String display,host;
    public void Ask(){
        System.out.println("Which display do you like?\n Sumsung or Dell?");
        Scanner sun = new Scanner(System.in);
        this.display =sun.nextLine();
        System.out.println("Which host do you like?\n Top ,Middle or Low?");
        sun = new Scanner(System.in);
        this.host = sun.nextLine();
    }
    public Computer GetAcom(){
        builder.cPart(this.display,this.host);
        return builder.getComputer();
    }
}
