package liskov;

public class Cardinal extends Bird {
    @Override
    public void fly() {
        // Cardinals can fly, so we provide an implementation here
        System.out.println("The cardinal is flying.");
    }
}
