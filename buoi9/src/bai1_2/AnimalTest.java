package bai1_2;

public class AnimalTest {
    public static void main(String[] args) {
        Cat meo = new Cat("Meo");
        Dog cho = new Dog("Cho");
        Cow bo = new Cow("Bo");
        meo.introduce();
        System.out.println(meo.getPopulation());
        meo.getBirth();

        cho.introduce();
        System.out.println(cho.getPopulation());
        bo.introduce();
        System.out.println(bo.getPopulation());
        //câu 5 chưa làmmm
    }
}
