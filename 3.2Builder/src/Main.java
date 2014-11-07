/**
 * Created by FF on 2014/11/7.
 */
public class Main {
    public static void main(String[] args){
        Director director =new Director();
        director.Ask();
        Computer com1=director.GetAcom();
        com1.showComputer();
        director.Ask();
        Computer com2=director.GetAcom();
        com2.showComputer();
    }
}
