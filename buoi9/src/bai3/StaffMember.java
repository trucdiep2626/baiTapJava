package bai3;

public abstract class StaffMember {
    protected String Name;
    protected String Address;
    protected String Phone;

    public StaffMember() {
    }

    @Override
    public String toString() {
        return "StaffMember{" +
                "Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", Phone='" + Phone + '\'' +
                '}';
    }
    public abstract double Pay();
}
