package bai5;

public class Student extends PERSON {
    protected String Lop;

    @Override
    public String toString() {
        return "Student{" +
                "Lop='" + Lop + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
