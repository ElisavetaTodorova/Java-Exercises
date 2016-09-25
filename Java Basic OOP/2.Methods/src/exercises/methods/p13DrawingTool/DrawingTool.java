package exercises.methods.p13DrawingTool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ELISAV on 3.9.2016 г..
 */
public class DrawingTool {

    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String type=reader.readLine();
       CoreDraw figure=null;
        switch (type){
            case "Square":
                int size=Integer.valueOf(reader.readLine());
                figure=new Square(size);
                break;
            case "Rectangle":
                int x=Integer.valueOf(reader.readLine());
                int y=Integer.valueOf(reader.readLine());
                figure=new Rectangle(x,y);
                break;
        }
        figure.draw();

    }

}
