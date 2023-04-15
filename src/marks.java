import java.util.Scanner;
public class marks {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter your name: ");
            String name = input.nextLine();

            System.out.print("Enter the number of subjects: ");
            int numSubjects = input.nextInt();

            int[] marks = new int[numSubjects];
            for (int i = 0; i < numSubjects; i++) {
                System.out.print("Enter marks for subject " + (i+1) + ": ");
                marks[i] = input.nextInt();
            }

            int totalMarks = 0;
            for (int i = 0; i < numSubjects; i++) {
                totalMarks += marks[i];
            }

            double averageMarks = (double)totalMarks / numSubjects;

            System.out.println("\nName: " + name);
            System.out.println("Marks: ");
            for (int i = 0; i < numSubjects; i++) {
                System.out.println("Subject " + (i+1) + ": " + marks[i]);
            }
            System.out.println("Total marks: " + totalMarks);
            System.out.printf("Average marks: %.2f", averageMarks);
        }
    }



