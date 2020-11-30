public class Employee {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;

    public Employee (String name, String position, String email, String phoneNumber, double salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String getPosition(){
        return position;
    }

    public String getEmail (){
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge(){
        return age;
    }

    public void printInfo(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return name + ", " + position + ", " + email + ", phone number " + phoneNumber + ", salary = " + salary + " RU, " + "age = " + age;
    }


}
