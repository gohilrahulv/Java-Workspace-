import java.util.Scanner;

public class Ex02VowelOrConsonant 
{

 
	public static void main(String[] args) 
    {
            
         	try (Scanner a = new Scanner(System.in)) {
                System.out.print("Enter Character : "); 

                String str = a.next();
                
                char ch = str.charAt(0); 
                if (Character.isDigit(ch))
                {
                	if(str.length()>1)
                	{
                		System.out.println("Error : Please Enter The Single Character...!!");
                	}
                	else
                	System.out.println("Error : Pleas Enter The Character Between A to Z or a To z...!!");
                }
                else if (str.length()>1)
                {
                    System.out.println("Error : Please Enter The Single Character...!!");
                }
                else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' 
                        || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                {
                    System.out.println(ch + " is vowel");
                }
                
                else
                {
                    System.out.println(ch + " is consonant");
                }
            } 
        
            System.out.println("Success");
        
    }
}
