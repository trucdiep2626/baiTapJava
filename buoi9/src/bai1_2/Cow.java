package bai1_2;

public class Cow extends Animal {
    protected int population =0;

    public int getPopulation() {
        return population;
    }
    public Cow(String name) {
        super(name);
        System.out.println("tạo cow");
        population++;
    }

    @Override
    public void makeASound() {
        System.out.println("pooooooo");
    }

    @Override
    public void introduce() {
        super.introduce();
    }
}
