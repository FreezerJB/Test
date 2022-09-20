package fr.jalel.coursjava;

public class Kiwi extends Fruit implements PeelFruit{

    private boolean peeled = true;

    public Kiwi() {
        super("Kiwi");
    }

    @Override
    public void taste() {
        System.out.println("Le gout est sucré");

    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public boolean hasSeed() {
        return false;
    }

    @Override
    public boolean isPeeled() {
        return peeled;
    }

    @Override
    public String getSkinType() {
        return "doux";
    }
}
