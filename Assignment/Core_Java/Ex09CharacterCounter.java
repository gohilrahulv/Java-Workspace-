import java.util.Scanner;

class Ex09CharacterCounter 
{
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = s.nextLine();

            int letterCount = 0;
            int spaceCount = 0;
            int numberCount = 0;
            int otherCount = 0;

            for (int i = 0; i < input.length(); i++) 
            {
                char ch = input.charAt(i);
                if (Character.isLetter(ch)) 
                {
                    letterCount++;
                } 
                else if (Character.isDigit(ch)) 
                {
                    numberCount++;
                } 
                else if (Character.isWhitespace(ch)) 
                {
                    spaceCount++;
                } 
                else 
                {
                    otherCount++;
                }
            }

            System.out.println("Letter count: " + letterCount);
            System.out.println("Space count: " + spaceCount);
            System.out.println("Number count: " + numberCount);
            System.out.println("Other character count: " + otherCount);
        }
    }
}
