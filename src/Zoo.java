import java.util.ArrayList;
import java.util.List;

// quản lý động vật
public class Zoo {
    // khởi tạo danh sách chứa thông tin động vật
    private List<Animal> list;
    public Zoo() {
        list = new ArrayList<>();
    }
    // phương thức thêm thông tin động vật vào danh sách
    public void addAnimal(Animal animal) {
        list.add(animal);
    }
    // phương thức hiển thị thông tin động vật
    public void displayAnimals() {
        for (Animal animal : list) {
            animal.dispalyAnimal();
            // hiển thị hành vi đặc biệt
            // toán tử instanceof được sử dụng để kiểm tra một đối tượng có phải là thể hiện của một kiểu dữ liệu cụ thể
            // (lớp, lớp con, interface)
            if(animal instanceof Lion) {
                System.out.printf("Hành vi đặc biệt: ");
                Lion lion = (Lion) animal;
                lion.hanhViDacBiet();
            }
            else if(animal instanceof Dog) {
                System.out.printf("Hành vi đặc biệt: ");
                Dog dog = (Dog) animal;
                dog.hanhViDacBiet();
            }
            else if(animal instanceof Cat) {
                System.out.printf("Hành vi đặc biệt: ");
                Cat cat = (Cat) animal;
                cat.hanhViDacBiet();
            }
        }
    }
}
