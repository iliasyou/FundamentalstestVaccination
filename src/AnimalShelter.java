import java.util.*;

public class AnimalShelter {
    private List<Animal> animals = new ArrayList<>();

    private int animalId;


    public void printAnimals() {
        animals.forEach(System.out::println);
    }

    public void sortAnimals() {
        animals.sort(Comparator.comparingInt(Animal::getAnimalNumber));

    }

    public void sortAnimalByName() {
        Collections.
                sort(animals, Comparator.comparing(Animal::getName));

    }

    public void sortAnimalByAge() {
        Collections.
                sort(animals, Comparator.comparingInt(Animal::getAge));

    }

    public void printAnimalNotVaccinated(Disease disease) {

        animals.stream()
                .filter(animal -> !animal.getIsVaccinated().get(disease))
                .forEach(animal -> System.out.println(animal.getName()));


    }


    public Optional<Animal> findAnimal(int animalNumber) {
        return
                animals.stream()
                        .filter(animal -> animal.getAnimalNumber() == animalNumber)
                        .findFirst();


    }


    public Optional<Animal> findAnimal(String name) {
        return
                animals.stream()
                        .filter(animal -> animal.getName().equals(name))
                        .findFirst();


    }

    public void treatAnimal(int animalNumber) {
        animals.stream()
                .filter(animal -> animal.getAnimalNumber() == animalNumber)
                .forEach(Animal::treatAnimal);
    }

    public void treatAnimal(String name) {
        animals.stream().filter(animal -> animal.getName().equals(name))
                .forEach(Animal::treatAnimal);

    }

    public void treatAllAnimals() {
        animals.forEach(Animal::treatAnimal);


    }

    public Animal findOldestAnimal() {
        return
                animals.stream()
                        .max(Comparator.comparingInt(Animal::getAge))
                        .orElse(null);


    }

    public int countAnimals() {
        return animals.size();

    }

    public void addAnimal(Animal animal) {
        animal.setAnimalNumber(animalId++);
        animal.setName(animal.getName());
        animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    @Override
    public String toString() {
        return "AnimalShelter{" +
                "animals=" + animals +
                ", animalId=" + animalId +
                '}';
    }
}

