package bai1;

public class Employee extends Person {
    private int salary;

    public Employee(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString()+
                "salary=" + salary +
                '}';
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
