public class Lion extends Animal{
    public Lion(String name, int age){
        super(name, age);
    }
    // hành vi cơ bản

    @Override
    public void tiengKeu() {
        System.out.println("Tiếng kêu: Gầm");
    }

    // hành vi đặc biệt
    public void hanhViDacBiet() {
        System.out.println("Săn mồi");
    }
}
