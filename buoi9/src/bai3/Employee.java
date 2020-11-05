package bai3;

public class Employee extends StaffMember {
    protected String socialSecurityNumber;
    protected double payRate;

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", payRate=" + payRate +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", Phone='" + Phone + '\'' +
                '}';
    }

    @Override
    public double Pay() {
        return 0;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
}
