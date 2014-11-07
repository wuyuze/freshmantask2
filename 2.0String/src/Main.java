import java.util.Scanner;

/**
 * Created by FF on 2014/11/7.
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Input a string");
        Scanner sun= new Scanner(System.in);
        String str =sun.nextLine();
        System.out.println("Do you want to Upper or Lower or Delete?");
        String m = sun.nextLine();
        OneString obj=new Origion();
        obj.ostr(str);
        ChangeOrigin nobj =new ChangeOrigin();
        nobj.ch(str,m,obj);
    }
}
