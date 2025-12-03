package state;

public class End implements IPlayerMode{
    @Override
    public void press(Phone phone) {
        if (phone.getPlayer().equals(this) ) {
            System.out.println("State changed to : Stopped");
            phone.setPlayer(new Stopped());
        }
    }
}
