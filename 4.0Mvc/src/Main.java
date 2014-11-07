import java.util.Scanner;

/**
 * Created by FF on 2014/11/7.
 */
public class Main {
    public static void main(String[] args){
        Model car=new Model();
        View cardisplay=new View(car);
        Controler control =new Controler(car);
        cardisplay.changeview();
        System.out.println();
        System.out.println("1.speedup \n2.speeddown \n3.turn\n4.trunlight\nInput Number:");
        Scanner sun =new Scanner(System.in);
        for(int i=sun.nextInt();i!=0;){
            control.start(i);
            cardisplay=new View(control.model);
            cardisplay.changeview();
            System.out.println("Next :   input 0 to exit");
            sun=new Scanner(System.in);
            i=sun.nextInt();
        }
    }
}
