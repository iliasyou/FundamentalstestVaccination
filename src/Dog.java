public class Dog extends Animal {
    private boolean hasFoulBreath;


    public Dog() {
    }

    public Dog(boolean hasFoulBreath) {
        this.hasFoulBreath = hasFoulBreath;
    }

    public void setHasFoulBreath(boolean hasFoulBreath) {
        this.hasFoulBreath = hasFoulBreath;
    }

    public boolean isHasFoulBreath() {
        return hasFoulBreath;
    }

    public Dog(boolean isClean, int age, String name, int animalNumber, boolean hasFoulBreath) {
        super(isClean, age, name, animalNumber);
        this.hasFoulBreath = hasFoulBreath;
    }

    @Override
    public void treatAnimal() {
        this.setClean(false);
        this.setHasFoulBreath(false);

    }

    @Override
    public void vaccinateAnimal(Disease disease) {

    }

    @Override
    public String toString() {
        return "Dog{" +
                "hasFoulBreath=" + hasFoulBreath +
                "} " + super.toString();
    }
}
