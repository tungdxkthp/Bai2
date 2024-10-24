
public class Main {
    public static void main(String[] args) {
        // khởi tạo đối tượng
        Zoo zoo = new Zoo();
        Animal dog = new Dog("DogA", 3);
        Animal dog2 = new Dog("John", 1);
        Animal cat = new Cat("CatB", 2);
        Animal lion = new Lion("LionC", 1);

        // thêm đối tượng vào danh sách
        zoo.addAnimal(dog);
        zoo.addAnimal(dog2);
        zoo.addAnimal(cat);
        zoo.addAnimal(lion);
        // hiển thị thông tin
        zoo.displayAnimals();
    }
}