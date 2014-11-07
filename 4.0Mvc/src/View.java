/**
 * Created by FF on 2014/11/7.
 */
public class View {
    Model model ;
    public View(Model model){
        this.model=model;
    }
    public void changeview(){
        System.out.println("Speed:     "+model.speed);
        System.out.println("Light:     "+model.light);
        System.out.println("Direction: "+model.direction);
    }

}
