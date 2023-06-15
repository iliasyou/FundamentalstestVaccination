import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        AnimalShelter animalShelter = new AnimalShelter();
        Animal cat1 = new Cat(true, 1, "minou", 212, false);
        Animal cat2 = new Cat(false, 6, "milou", 243, true);
        Animal cat3 = new Cat(true, 8, "nayia", 255, false);


        Animal dog1 = new Dog(false, 15, "tayson", 875, true);
        Animal dog2 = new Dog(true, 18, "nala", 775, false);
        Animal dog3 = new Dog(true, 11, "klab", 5, true);
        Animal dog4 = new Dog(false, 12, "Alan", 268, false);


        Animal monkey1 = new Monkey(false, 3, "Tchita", 13, true);
        Animal monkey2 = new Monkey(true, 10, "Tchito", 113, false);
        Animal monkey3 = new Monkey(false, 20, "Mimika", 323, false);


        animalShelter.addAnimal(cat1);
        animalShelter.addAnimal(cat2);
        animalShelter.addAnimal(cat3);
        animalShelter.addAnimal(dog1);
        animalShelter.addAnimal(dog2);
        animalShelter.addAnimal(dog3);
        animalShelter.addAnimal(monkey1);
        animalShelter.addAnimal(monkey2);
        animalShelter.addAnimal(monkey3);
        animalShelter.addAnimal(dog4);


        animalShelter.sortAnimals();
        animalShelter.sortAnimalByAge();
        animalShelter.printAnimals();
        animalShelter.sortAnimalByName();


        cat1.vaccinateAnimal(Disease.HEPATITISA);
        dog1.vaccinateAnimal(Disease.POLIO);
        monkey1.vaccinateAnimal(Disease.HEPATITISA);
        monkey2.vaccinateAnimal(Disease.FLUE);


        System.out.println(animalShelter.findAnimal(323));
        animalShelter.findAnimal("Mimika");

        animalShelter.treatAnimal(243);
        animalShelter.treatAnimal("milou");

        animalShelter.treatAllAnimals();

        System.out.println(animalShelter.findOldestAnimal().getName());

        System.out.println(animalShelter.countAnimals());


    }
}







