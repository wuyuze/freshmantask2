/**
 * Created by FF on 2014/11/7.
 */
public class Factory {
    Computer com;
    String l;
    public Factory(String l){
        if (l.equals("Top" )){
            com=new Top();
        }
        else if(l.equals("Mid")){
            com=new Mid();
        }
        else if(l.equals("Low")){
            com=new Low();
        }
        else {
            System.out.println("We don't have this level's computer!");
        }
    }
}
