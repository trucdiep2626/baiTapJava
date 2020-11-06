package bai5;

import java.util.ArrayList;

public class CLASS {
    protected String name;
    ArrayList<Student> studentList = new ArrayList<>();
    protected int numofStudent;
    protected Teacher advisor;
    void printList()
    {
        for (Student x: studentList) {
            System.out.println(x.toString());
        }
    }
}
