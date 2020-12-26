package bai4;

import java.util.Date;

public class Person implements Mammal {
    protected String firstName;
    protected BloodGroup nhomMau;
    protected address diaChi;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setDateOfBirth(Date dob) {

    }

    @Override
    public int getAgeAsDay() {
        return 0;
    }

}
