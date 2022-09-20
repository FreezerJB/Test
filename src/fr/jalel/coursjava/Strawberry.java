package fr.jalel.coursjava;

public class Strawberry extends Fruit{

    public Strawberry() {
        super("Fraise");
    }

    @Override
    public void taste() {
        System.out.println("ça a un gout sucré");

    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public boolean hasSeed() {
        return false;
    }
}
