public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }
    //

    @Override
    public void tiengKeu() {
        System.out.println("Tiếng kêu: Meo");
    }

    // hành vi đặc biệt
    public void hanhViDacBiet() {
        System.out.println("Trèo Cây");
    }
}
