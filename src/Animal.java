public abstract class Animal {
    protected String name;
    protected int age;
    //
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    // constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // hành vi cơ bản
    public abstract void tiengKeu();
    // hiển thị thông tin
    public void dispalyAnimal() {
        System.out.println("Tên: " + name + " - Tuổi: " + age);
        tiengKeu();
    }
}
