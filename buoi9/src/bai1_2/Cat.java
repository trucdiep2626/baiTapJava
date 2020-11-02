package bai1_2;

public class Cat extends Animal {
    protected int population =0;

    public int getPopulation() {
        return population;
    }

    public Cat(String name) {
        super(name);
        System.out.println("tạo Cat");
        population++;
    }

    @Override
    public void makeASound() {
        System.out.println("meo");
    }

    @Override
    public void introduce() {
        super.introduce();
    }
}
