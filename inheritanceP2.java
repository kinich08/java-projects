//4. Write a Java program to create a class called Employee with methods called work() and getSalary().
// Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().

class Employee{
    private int salary;
    public Employee(int salary){
        this.salary=salary;
    }
    public void work(){
        System.out.println("Employee");
    }
    public int GetSalary(){
        return salary;
    }
}
class HRManager extends Employee{
    public HRManager(int salary){
        super(salary);
    }
    public void work(){
       System.out.println("Managing employee");
    }
    public void addEmployee(){
       System.out.println("Adding new employee");
    }
}

public class inheritanceP2 {
    public static void main(String[] args) {
        Employee e=new Employee(30000);
        HRManager m=new HRManager(50000);
        e.work();
        System.out.println("Employee salary: " + e.GetSalary());
        m.work();
        System.out.println("Employee salary: " + m.GetSalary());
    }
}
