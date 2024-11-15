public class Animal{
    protected int age;
    protected double weight;

    public Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
        System.out.println("Animal constructor called.");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public final void displayWeight() {
        System.out.println("Weight: " + weight);
    }

    public void makeSound(){
        System.out.println("Animal makes a sound");
    }
}