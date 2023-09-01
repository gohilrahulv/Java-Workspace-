public class Ex25Member 
 {
    // Data members
    private String name;
    private int age;
    private String mobile;
    private String address;
    private double salary;

    // Constructor
    public Ex25Member(String name, int age, String mobile, String address, double salary) {
        this.name = name;
        this.age = age;
        this.mobile = mobile;
        this.address = address;
        this.salary = salary;
    }

    // Method to print the salary of the member
    public void printSalary() {
        System.out.println(name + "'s Salary: " + salary);
    }

    // Getters and Setters for the data members (optional)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        // Create a Member object and print the salary
        Ex25Member member1 = new Ex25Member("Rahul Gohil", 21, "1234567890", "123 Main Street", 50000.0);
        member1.printSalary(); // Output: John Doe's Salary: 50000.0
    }
}
