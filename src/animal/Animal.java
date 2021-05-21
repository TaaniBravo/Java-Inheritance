package animal;

public class Animal {
    public int age;

    public Animal (int age) {
        this.age = age;
        System.out.println("An animal has been created.");
    }

    public void eat () {
        System.out.println("An animal is eating.");
    }

    public static void main(String[] args) {
        Animal a = new Animal(1);
        Dog cruz = new Dog(3);
        Cat maow = new Cat(1);
    }
}
