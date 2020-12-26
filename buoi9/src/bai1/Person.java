package bai1;

public abstract class Person {
    private String name;

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", address='" + address + '\'' ;
    }

    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
