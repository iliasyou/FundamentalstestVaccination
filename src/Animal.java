import java.util.HashMap;
import java.util.Map;

public abstract class Animal implements Vaccinateable, Treatable {
    private Map<Disease, Boolean> isVaccinated = new HashMap<>();
    private boolean isClean;
    private int age;
    private String name;
    private int animalNumber;

    public Animal() {
    }

    public Animal(boolean isClean, int age, String name, int animalNumber) {
        this.isClean = isClean;
        this.age = age;
        this.name = name;
        this.animalNumber = animalNumber;
    }

    public boolean isClean() {
        return isClean;
    }

    public Map<Disease, Boolean> getIsVaccinated() {
        return isVaccinated;
    }

    public void setIsVaccinated(Map<Disease, Boolean> isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnimalNumber() {
        return animalNumber;
    }

    public void setAnimalNumber(int animalNumber) {
        this.animalNumber = animalNumber;
    }

    @Override
    public void vaccinateAnimal(Disease disease) {
        isVaccinated.put(disease, true);

    }

    @Override
    public String toString() {
        return "Animal{" +
                "isVaccinated=" + isVaccinated +
                ", isClean=" + isClean +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", animalNumber=" + animalNumber +
                '}';
    }
}


