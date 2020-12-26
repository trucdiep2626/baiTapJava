package bai1_2;

public abstract class Animal {
    public Animal() {
    }

    protected String Name;

    public Animal(String name) {
        System.out.println("tạo Animal");
        Name = name;
    }

    public abstract void makeASound();
    public void introduce()
    {
        makeASound();
        System.out.println("To la "+Name);
    }
    public void getBirth()
    {
        System.out.println(Name+"'s Baby");
    }

}
