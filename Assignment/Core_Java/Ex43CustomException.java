

class AgeNotWithinRangeException extends Exception
{
    public AgeNotWithinRangeException(String msg)
    {
        super(msg);
    }
}

class NameNotValidException extends Exception
{
    public NameNotValidException (String msg)
    {
        super(msg);
    }
}

class student
{
    private int rollno;
    private String name;
    private int age;
    private String course;
    

    public student(int rollno,String name,int age,String course) throws AgeNotWithinRangeException,NameNotValidException
    {
        if (age<15 || age>21)
        {
            throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
        }
        if(!isValidName(name))
        {
            throw new NameNotValidException("Name contains invalid characters.");
        }
         this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.course = course;
    }
    private boolean isValidName(String name)
    {
        return name.matches("[a-zA-Z ]+");
    }
     public void display() 
     {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }            
}

public class Ex43CustomException 
{
    public static void main(String[] args) 
    {
        try {
            student s1 = new student(101, "Gohil Rahul", 20, "Computer Science");
            s1.display();
        } catch (AgeNotWithinRangeException e) {
            System.out.println("Age Exception: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("Name Exception: " + e.getMessage());
        }
    }
}
