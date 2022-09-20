package fr.jalel.coursjava;

public class Apple extends Fruit{


    public Apple() {
        super("Pomme");
    }

    @Override
    public void taste() {
        System.out.println("La pomme à plutôt un gout sucrée");
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public boolean hasSeed() {
        return true;
    }
}
