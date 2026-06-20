import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the student's score (0-100): ");
        int score = input.nextInt();

        if (score >= 90) 
           System.out.println("Grade: Excellent (A)");
           
        else if(score >= 80) 
           System.out.println("Grade: Very Good (B)");
        
        else if (score >= 70)
           System.out.println("Grade: Good (C)");
       
        else if (score >=60)
           System.out.println("Grade: Pass (D)");
         
        else
          System.out.println("Grade: Fail (F)");
    }
}
