import java.util.Scanner;

public class Ex34Mark 
{
    public static void displayGrade(int marks) 
    {
        String grade;
        if(marks>=91 && marks<=100)
        {
            grade = "AA";
            System.out.println("Your Grade: " + grade);
        }
        else if(marks>=81 && marks<=90)
        {
            grade = "AB";
            System.out.println("Your Grade: " + grade);
        }
        else if(marks>=71 && marks<=80)
        {
            grade = "BB";
            System.out.println("Your Grade: " + grade);
        }
        else if (marks >= 61 && marks <= 70) 
        {
            grade = "BC";
            System.out.println("Your Grade: " + grade);
        }
        else if (marks >= 51 && marks <= 60) 
        {
            grade = "CD";
            System.out.println("Your Grade: " + grade);
        } 
        else if (marks >= 41 && marks <= 50) 
        {
            grade = "DD";
            System.out.println("Your Grade: " + grade);
        } 
        else if (marks >= 0 && marks <= 40)  
        {
            grade = "Fail";
            System.out.println("You Are " + grade+".");
        }
        else
        {
            grade = "Invalid Marks";
            System.out.println("Your Enter " + grade+".");
        }
        
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Marks Out Of 100 : ");
        int marks = sc.nextInt();

        displayGrade(marks);
        sc.close();
    } 
   
}