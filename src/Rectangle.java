import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Float length;
        float width, area,perimeter;
        Scanner side=new Scanner(System.in);
        System.out.println("Enter length of a rectangle:");
        length= side.nextFloat();


        System.out.println("Enter  width of a rectangle:" );
        width= side.nextFloat();

        area=length*width;
         perimeter=(length+length)+(width+width);
         System.out.println("Area is "+area);
        System.out.println("perimeter  is "+perimeter);

        side.close();
    }

}
