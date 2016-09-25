package exercises.methods.p13DrawingTool;

/**
 * Created by ELISAV on 3.9.2016 г..
 */
public class Square implements CoreDraw {
    private Integer x;

    public Square(Integer x) {
        this.x = x;
    }
    public void draw(){

        System.out.printf("|%s|%n",new String(new char[this.x]).replace('\0','-'));
        for (int i = 0; i < this.x-2; i++) {
            System.out.printf("|%s|%n",new String(new char[this.x]).replace('\0',' '));

        }
        System.out.printf("|%s|%n",new String(new char[this.x]).replace('\0','-'));

    }
}
