package bai3;

public class Hourly extends Employee {
    protected int hoursWorked;
    public void addHours(int moreHours)
    {

    }

    @Override
    public String toString() {
        return "Hourly{" +
                "hoursWorked=" + hoursWorked +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", payRate=" + payRate +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", Phone='" + Phone + '\'' +
                '}';
    }

    @Override
    public double Pay() {
        return super.Pay();
    }
}
