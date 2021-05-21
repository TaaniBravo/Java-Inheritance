package animal;

public class Dog extends Animal{
    public Dog (int age) {
        super(age);
        System.out.println("A dog has been born.");
    }

    public void bark () {
        System.out.println("The dog barks!");
    }

    public void run() {
        System.out.println("A dog is running");
    }
}
