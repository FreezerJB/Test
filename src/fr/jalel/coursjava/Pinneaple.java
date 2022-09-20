package fr.jalel.coursjava;

public class Pinneaple extends Fruit implements PeelFruit{

    private boolean peeled = false;

    public Pinneaple() {
        super("ananas");
    }

    @Override
    public void taste() {

        System.out.println("L'ananas à un gout un peu acide");

    }

    @Override
    public int getSize() {
        return 2;
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
        return "piqante";
    }
}
