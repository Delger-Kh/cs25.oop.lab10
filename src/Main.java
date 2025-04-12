import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> source = new ArrayList<>();
        source.add(new Mammal("Арслан")); // Lion
        source.add(new Bird("Тогоруу")); // Crane

        List<Animal> destination = new ArrayList<>();

        Zoo<Animal> zoo = new Zoo<>();
        zoo.transferAnimals(source, destination);

        for (Animal animal : destination) {
            System.out.println(animal.getName());
        }
    }
}
