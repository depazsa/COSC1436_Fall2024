public final class Dog extends Animal{
    public String breed;

    public Dog(int age, double weight, String breed) {
        super(age, weight); // Calls the Animal constructor
        this.breed = breed;
        System.out.println("Dog constructor called.");
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Woof! Woof!");
    }

       
    public void showDogDetails() {
        System.out.println("This dog is a " + breed + ".");
        makeSound();
    }
}