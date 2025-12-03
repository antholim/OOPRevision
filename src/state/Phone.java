package state;

public class Phone {
    private IPlayerMode player;
    // Stopped -> Playing -> Pause -> End
    public Phone() {
        player = new Stopped();
    }

    public IPlayerMode getPlayer() {
        return player;
    }
    public void setPlayer(IPlayerMode player) {
        this.player = player;
    }
    public void nextState() {
        player.press(this);
    }
}
