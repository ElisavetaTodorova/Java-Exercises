package exercises.methods.p13DrawingTool;

/**
 * Created by ELISAV on 3.9.2016 г..
 */
public class Rectangle implements CoreDraw{
    private Integer x;
    private Integer y;

    public Rectangle(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
    public void draw(){

        System.out.printf("|%s|%n",new String(new char[this.x]).replace('\0','-'));
        for (int i = 0; i < this.y-2; i++) {
            System.out.printf("|%s|%n",new String(new char[this.x]).replace('\0',' '));

        }
        System.out.printf("|%s|%n",new String(new char[this.x]).replace('\0','-'));
    }

}
