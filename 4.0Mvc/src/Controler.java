import java.util.Scanner;

/**
 * Created by FF on 2014/11/7.
 */
public class Controler {
    Model model;
    Scanner i ;
    public  Controler(Model model){
        this.model=model;
    }
    public void Speedup(){
        System.out.print("How much v?");
        i=new Scanner(System.in);
        float v=i.nextFloat();
        model.speedup(v);
    }
    public void Speeddown(){
        System.out.print("How much v?");
        i=new Scanner(System.in);
        float v=i.nextFloat();
        model.speeddown(v);
    }
    public void changelight(){
        model.changelight();
    }
    public void changedirection(){
        System.out.println("How much angle?");
        i=new Scanner(System.in);
        float a=i.nextFloat();
        model.turn(a);
    }
    public void start(int s){
        switch (s){
            case 1:{
                Speedup();
                break;
            }
            case 2:{
                Speeddown();
                break;
            }
            case 3:{
                changedirection();
                break;
            }
            case 4:{
                changelight();
                break;
                }
            }
        }
    }

