package state;

public class Playing implements IPlayerMode {
    @Override
    public void press(Phone phone) {
        if (phone.getPlayer().equals(this) ) {
            System.out.println("State changed to : Pause");
            phone.setPlayer(new Pause());
        }
    }
}
