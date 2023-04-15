import  java.util.Scanner;
public class Simple {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name= input.nextLine();
        System.out.println("You have entered "+name);
        input.close();
        int x=100;
        int y=13;
        if(x % 2 == 0){
            System.out.println("x is even");
        }
        else if(x %2 !=0) {
            System.out.println("X is odd");
        }
        else if(y %2 == 0){
            System.out.println("y is prime");
        }
        else {
            System.out.println("X is unknown");
        }
        System.out.println("Hello java");
    }
}
