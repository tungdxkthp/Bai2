public class Dog extends Animal{
    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    public void tiengKeu() {
        System.out.println("Tiếng kêu: Gâu");
    }

    public void hanhViDacBiet(){
        System.out.println("Đánh hơi");
    }
}
