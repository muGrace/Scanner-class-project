import  java.util.Scanner;



public class Circle {
    public static void main(String[] args) {
        float area;
        float pie= (float) 3.142;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter radius:");
        float rad=input.nextFloat();
        System.out.println("radius is"+rad);
        area=pie*rad *rad;

        System.out.println("Area is"+area);
        Scanner word=new Scanner(System.in);
        System.out.println("Enter name of your school");
        String school=word.next();
        System.out.println("Your school is called "+school);
        word.close();


    }
}
