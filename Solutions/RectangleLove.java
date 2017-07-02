/*-----------------------------------------------------------------------------------
 * <p> Title: Love Rectangle. </p>
 *
 * <p> Description: A program to calculate the retangle object of two intersected rectangles </p>
 *
 * <p> Copyright: Venkatesh Bejjenki © 2017 </p>
 *
 * @author Venkatesh Bejjenki
 *------------------------------------------------------------------------------------
*/



import java.util.*;
class Rectangle {

    // "zero" rectangle
    public final Rectangle NO_RECTANGLE = new Rectangle();

    // coordinates of bottom left corner
    private int leftX;
    private int bottomY;

    // dimensions
    private int width;
    private int height;

    public Rectangle() {}

    public Rectangle(int leftX, int bottomY, int width, int height) {
        this.leftX = leftX;
        this.bottomY = bottomY;
        this.width  = width;
        this.height = height;
    }

    public int getLeftX() {
        return leftX;
    }

    public int getBottomY() {
        return bottomY;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
public class RectangleLove {

    int leftX;
    int rightX;
    int bottomY;
    int topY;

    public void findCoordinates(Rectangle r){
        leftX = r.getLeftX();
        rightX= r.getLeftX()+r.getWidth();
        bottomY = r.getBottomY();
        topY = r.getBottomY()+r.getHeight();
    }

    public Rectangle intersect(Rectangle r1,Rectangle r2){
        int leftXFinal;
        int bottomYFinal;
        int widthFinal=0;
        int widthFinal=0;


        if () {

        }
    }

    public static void main(String[] args) {
        //Creating object with leftX,bottomY,width,height
        Rectangle r1 = new Rectangle(1,2,4,3);
        Rectangle r2 = new Rectangle(4,4,2,3);

        Rectangle r = intersect(r1,r2);


    }

}
