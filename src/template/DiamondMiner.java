package template;

public class DiamondMiner extends Miner{
    @Override
    public void step1() {
        System.out.println("Trying to mine diamond step 1");
    }

    @Override
    public void step4() {
        System.out.println("Found diamond step 4");
    }
}
