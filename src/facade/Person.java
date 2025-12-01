package facade;

public class Person {
    private Hand hand = new Hand();
    private Camera camera = new Camera();
    private Facade facade = new Facade();

    public void takeVideo() {
        facade.takePicture(camera, hand);
    }

    public void takePhoto() {

    }
}
