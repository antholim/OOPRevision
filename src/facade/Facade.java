package facade;

public class Facade {
    public void takePicture(Camera camera, Hand hand) {
        hand.press();
        camera.clickFlash();
        camera.recordVideo();
        camera.finishVideo();
    }
}
