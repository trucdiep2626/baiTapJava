package bai5;

public class PERSON {
    protected String name;
    protected String address;
    protected String department;

    @Override
    public String toString() {
        return "PERSON{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
