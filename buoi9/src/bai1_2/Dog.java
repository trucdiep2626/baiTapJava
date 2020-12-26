package bai1_2;

public class Dog extends Animal{
    protected int population =0;

    public int getPopulation() {
        return population;
    }
    public Dog(String name) {
        super(name);
        System.out.println("tạo Dog");
        population++;
    }

    @Override
    public void makeASound() {
        System.out.println("gau gau");
    }

    @Override
    public void introduce() {
        super.introduce();
    }
}
