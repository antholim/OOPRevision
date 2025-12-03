package state;

public class Stopped implements IPlayerMode{
    @Override
    public void press(Phone phone) {
        if (phone.getPlayer().equals(this) ) {
            System.out.println("State changed to : Playing");
            phone.setPlayer(new Playing());
        }
    }
}
