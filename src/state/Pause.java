package state;

public class Pause implements IPlayerMode{
    @Override
    public void press(Phone phone) {
        if (phone.getPlayer().equals(this) ) {
            System.out.println("State changed to : End");
            phone.setPlayer(new End());
        }
    }
}
