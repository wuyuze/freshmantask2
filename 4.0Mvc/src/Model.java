/**
 * Created by FF on 2014/11/7.
 */
public class Model {
    public int speed =0;
    public float direction =0;
    public boolean light = false;
    public void speedup(float v){
        this.speed+=v;
        if(this.speed<0){
            this.speed=0;
        }
    }
    public void speeddown(float v){
        this.speed-=v;
        if (this.speed<0){
            this.speed=0;
        }
    }
    public void changelight(){
        light= !light;
    }
    public void turn(float a){
        direction+=a;
    }
}
