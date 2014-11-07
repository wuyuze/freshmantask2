/**
 * Created by FF on 2014/11/7.
 */
public class DoTask implements TaskCommand {
    Tasklist tasklist=new Tasklist();
    int m;
    public void DoTask(Tasklist obj){
        tasklist=obj;
    }
    public void task(int i){
        m=i;
        switch (m) {
            case 1:
                this.tasklist.task1();
                break;
            case 2:
                this.tasklist.task2();
                break;
            case 3:
                this.tasklist.task3();
                break;
        }
    }
}
